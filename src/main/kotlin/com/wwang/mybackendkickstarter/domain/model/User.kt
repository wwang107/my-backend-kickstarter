package com.wwang.mybackendkickstarter.domain.model

import javax.persistence.*

@Entity
@Table(name = "USER")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(name = "username", nullable = false)
    var userName: String? = null
}
