package com.desafio.cadastrousuario.controller

import com.desafio.cadastrousuario.model.User
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UsuarioController {

    @PostMapping("/create")
    fun createUser(@RequestBody user: User){
        println("create user request")
        println(user)
    }
}