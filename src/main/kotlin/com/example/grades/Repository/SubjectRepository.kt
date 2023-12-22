package com.example.grades.Repository

import com.example.grades.Model.Student
import com.example.grades.Model.Subject
import org.springframework.data.jpa.repository.JpaRepository

interface SubjectRepository: JpaRepository<Subject, Long?> {
    fun findById(id:Long?):Subject?

    fun findByStudentId(studentId:Long?):List<Subject>
}