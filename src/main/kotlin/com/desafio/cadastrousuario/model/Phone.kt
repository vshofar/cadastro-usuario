package com.desafio.cadastrousuario.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
data class Phone (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val number: String,
    val ddd: String

){
    @ManyToOne
    @JsonIgnore
    lateinit var user: User

    constructor(number: String, ddd: String, user: User) : this(number = number, ddd = ddd){
        this.user = user
    }
}