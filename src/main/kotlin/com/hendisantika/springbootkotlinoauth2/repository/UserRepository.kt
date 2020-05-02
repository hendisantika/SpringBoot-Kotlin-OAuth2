package com.hendisantika.springbootkotlinoauth2.repository

import com.hendisantika.springbootkotlinoauth2.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-oauth2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/05/20
 * Time: 07.07
 */
@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByUsername(username: String?): User?
}