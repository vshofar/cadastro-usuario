package com.desafio.cadastrousuario.model

data class User(val name: String,
                val email: String,
                val password: String,
                val phones: List<Phone>)