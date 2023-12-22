package com.example.grades.Service

import com.example.grades.Model.Student
import com.example.grades.Repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {
    @Autowired
    lateinit var studentRepository: StudentRepository
    fun list():List<Student>{
        return studentRepository.findAll()
    }

    fun save(student: Student):Student{
        return studentRepository.save(student)
    }
}