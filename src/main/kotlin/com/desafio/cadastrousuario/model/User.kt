package com.desafio.cadastrousuario.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany
import kotlin.collections.ArrayList

@Entity
data class User(
                @Id
                @GeneratedValue
                val id: Long,
                val name: String,
                val email: String,
                val password: String)
{
    @OneToMany(mappedBy = "user")
    val phones: List<Phone> = ArrayList<Phone>()
}