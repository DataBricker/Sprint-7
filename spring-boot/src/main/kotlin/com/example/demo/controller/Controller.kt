package com.example.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping("hi")
    fun hiMethod(): ResponseEntity<String> = ResponseEntity.ok("Hi!")

}