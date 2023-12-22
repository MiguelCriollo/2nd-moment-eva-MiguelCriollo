package com.example.grades.Service

import com.example.grades.Model.Subject
import com.example.grades.Repository.StudentRepository
import com.example.grades.Repository.SubjectRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SubjectService {
    @Autowired
    lateinit var subjectRepository: SubjectRepository
    @Autowired
    lateinit var studentRepository: StudentRepository

    fun list():List<Subject>{
        return subjectRepository.findAll()
    }
    @Transactional
    fun save(subject: Subject):Subject{
        val response= subjectRepository.save(subject);
        var allStudentGrades=subjectRepository.findByStudentId(subject.studentId)
        var studentToUpdate=studentRepository.findById(subject.studentId);
        var total:Double=0.0;
        allStudentGrades.forEach{
            total += it.grade
        }
        total/=allStudentGrades.size

        studentToUpdate?.apply {
            average=total;
        }
        return response
    }
}