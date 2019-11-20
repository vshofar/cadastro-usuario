package com.desafio.cadastrousuario.service

import com.desafio.cadastrousuario.model.User
import com.desafio.cadastrousuario.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {
    override fun addUser(user: User) : User {
        return userRepository.save(user)
    }

    override fun getAll(): Iterable<User> {
        return userRepository.findAll()
    }
}