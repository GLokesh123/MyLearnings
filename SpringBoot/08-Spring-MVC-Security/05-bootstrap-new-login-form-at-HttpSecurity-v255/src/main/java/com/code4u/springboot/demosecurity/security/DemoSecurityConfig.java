package com.code4u.springboot.demosecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager()
    {
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();
        UserDetails mary = User.builder()
                .username("mary")
                .password("{noop}test456")
                .roles("EMPLOYEE","MANAGER")
                .build();
        return new InMemoryUserDetailsManager(john,mary);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)
    {
        http.authorizeHttpRequests(configurer->
                configurer.anyRequest().authenticated())
                .formLogin(
                        form-> form
                                        .loginPage("/showMyNewFancyLoginPage")
                                        .loginProcessingUrl("/authenticateTheUser")
                                        .permitAll()
                );
        return http.build();
    }
}
