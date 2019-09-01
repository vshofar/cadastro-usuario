package com.desafio.cadastrousuario.repository

import com.desafio.cadastrousuario.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int> {
}