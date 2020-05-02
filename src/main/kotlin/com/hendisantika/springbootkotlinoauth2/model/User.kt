package com.hendisantika.springbootkotlinoauth2.model

import java.io.Serializable
import java.sql.Timestamp
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-oauth2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/05/20
 * Time: 07.06
 */
@Entity
@Table(name = "users")
class User : Serializable {
    @Id
    var id = 0
    var username: String? = null
    var password: String? = null
    var created: Timestamp? = null

}