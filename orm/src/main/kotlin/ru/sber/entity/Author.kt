package ru.sber.entity

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Author(
    @Id
    @GeneratedValue
    var id: Long = 0,
    var firstName: String,
    var lastName: String,
    @OneToMany(mappedBy = "author", cascade = [CascadeType.ALL])
    var books: MutableList<Book>? = null
) {
    override fun toString() = "'${firstName[0]}. $lastName'"
}