package com.example.grades.Model

import jakarta.persistence.*
@Entity
@Table(name = "subject")
class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null;
    var description: String? = null;
    var grade: Double = 0.0
    @Column(name = "student_id")
    var studentId:Long?= null;
}