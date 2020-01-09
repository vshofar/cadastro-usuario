package com.desafio.cadastrousuario.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
data class User(
    @Id
    @GeneratedValue
    val id: Long = 0,
    val name: String,
    val email: String,
    val password: String,

    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    var createdDate: Long,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "user_id")
    var phones: List<Phone> = emptyList()
)
