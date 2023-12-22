package com.example.grades.Controller

import com.example.grades.Model.Subject
import com.example.grades.Service.SubjectService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/subject")
class SubjectController {
    @Autowired
    lateinit var subjectService: SubjectService

    @GetMapping()
    fun getAll():ResponseEntity<*>{
        return ResponseEntity(subjectService.list(),HttpStatus.OK)
    }

    @PostMapping()
    fun save(@RequestBody subject: Subject):ResponseEntity<Subject>{
        return ResponseEntity(subjectService.save(subject),HttpStatus.OK)
    }
}