package com.example.grades.Controller

import com.example.grades.Model.Student
import com.example.grades.Service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/student")
class StudentController {
    @Autowired
    lateinit var studentService: StudentService
    @GetMapping
    fun getAll():ResponseEntity<*>{
        return ResponseEntity(studentService.list(),HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody student: Student):ResponseEntity<Student>{
        return ResponseEntity(studentService.save(student),HttpStatus.OK)
    }
}