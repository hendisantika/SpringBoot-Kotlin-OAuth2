package com.hendisantika.springbootkotlinoauth2.controller

import com.hendisantika.springbootkotlinoauth2.model.User
import com.hendisantika.springbootkotlinoauth2.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-oauth2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/05/20
 * Time: 07.28
 */
@RestController
@RequestMapping("/api")
class UserController(private val userService: UserService) {

    @GetMapping("/users")
    fun getAllUsers(): List<User> = userService.getAllUsers()
}