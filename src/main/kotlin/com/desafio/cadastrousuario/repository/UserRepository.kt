package com.desafio.cadastrousuario.repository

import com.desafio.cadastrousuario.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

interface UserRepository : CrudRepository<User, Int> {
}