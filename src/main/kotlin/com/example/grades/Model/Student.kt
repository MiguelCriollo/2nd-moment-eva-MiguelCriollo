package com.example.grades.Model

import jakarta.persistence.*

@Entity
@Table(name = "students")
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null;
    @Column(name="full_Name")
    var fullName: String? = null;
    var email: String? = null;
    var average: Double? = null;
}