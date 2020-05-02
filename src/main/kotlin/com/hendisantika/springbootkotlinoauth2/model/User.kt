package com.hendisantika.springbootkotlinoauth2.model

import org.hibernate.annotations.CreationTimestamp
import java.io.Serializable
import java.sql.Timestamp
import javax.persistence.*

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id = 0
    var username: String? = null
    var password: String? = null

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP() on  UPDATE CURRENT_TIMESTAMP()")
    @CreationTimestamp
    var created: Timestamp? = null

}