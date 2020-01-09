package com.desafio.cadastrousuario.model

import javax.persistence.*

@Entity
data class Phone (
    @Id
    @GeneratedValue
    var id: Long = 0,
    val number: String,
    val ddd: String

)