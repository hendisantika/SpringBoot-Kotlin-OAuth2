package com.hendisantika.springbootkotlinoauth2.service

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kotlin-oauth2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/05/20
 * Time: 07.12
 */
@Configuration
@EnableResourceServer
class ResourceServerConfig : ResourceServerConfigurerAdapter() {
    override fun configure(resources: ResourceServerSecurityConfigurer) {
        resources.resourceId(RESOURCE_ID).stateless(false)
    }

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.anonymous().disable()
                .authorizeRequests()
                .antMatchers("/ws/**").access("hasRole('ADMIN')")
                .and().cors()
                .configurationSource(corsConfigurationSource())
                .and().exceptionHandling().accessDeniedHandler(OAuth2AccessDeniedHandler())
    }
}