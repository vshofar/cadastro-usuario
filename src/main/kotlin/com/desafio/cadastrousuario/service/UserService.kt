package com.desafio.cadastrousuario.service

import com.desafio.cadastrousuario.model.User

interface UserService {
    fun addUser(user: User)
    fun getAll() : Iterable<User>
}