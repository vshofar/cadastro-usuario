package com.desafio.cadastrousuario.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Phone (
    @Id
    @GeneratedValue
    val id: Long = 0,
    val number: String,
    val ddd: String

){
    @ManyToOne
    lateinit var user: User

    constructor(number: String, ddd: String, user: User) : this(number = number, ddd = ddd){
        this.user = user
    }
}