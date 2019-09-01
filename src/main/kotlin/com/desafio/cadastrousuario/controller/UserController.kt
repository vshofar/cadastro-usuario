package com.desafio.cadastrousuario.controller

import com.desafio.cadastrousuario.model.User
import com.desafio.cadastrousuario.repository.UserRepository
import com.desafio.cadastrousuario.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController() {

    @Autowired
    lateinit var userService : UserService

    @PostMapping("/add")
    fun createUser(@RequestBody user: User){
        println("create user request")
        println(user)
    }

    @GetMapping("/all")
    fun getAll() : Iterable<User>{
        println("query users")
        return userService.getAll()
    }
}