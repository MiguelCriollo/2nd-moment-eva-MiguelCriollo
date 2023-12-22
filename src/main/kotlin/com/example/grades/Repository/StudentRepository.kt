package com.example.grades.Repository

import com.example.grades.Model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Long?> {
    fun findById(id: Long?):Student?
}