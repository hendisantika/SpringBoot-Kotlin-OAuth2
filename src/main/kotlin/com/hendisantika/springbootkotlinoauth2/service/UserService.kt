package com.hendisantika.springbootkotlinoauth2.service

import com.hendisantika.springbootkotlinoauth2.model.User
import com.hendisantika.springbootkotlinoauth2.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-oauth2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/05/20
 * Time: 07.08
 */
@Service(value = "userService")
class UserService : UserDetailsService {
    @Autowired
    lateinit var userRepository: UserRepository

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(userId: String): UserDetails {
        val user: User = userRepository.findByUsername(userId)
                ?: throw UsernameNotFoundException("Invalid username or password.")
        return org.springframework.security.core.userdetails.User(user.username, user.password, authority)
    }

    private val authority: List<SimpleGrantedAuthority>
        private get() = listOf(SimpleGrantedAuthority("ROLE_ADMIN"))

    fun getAllUsers(): MutableList<User> {
        return userRepository.findAll()
    }
}