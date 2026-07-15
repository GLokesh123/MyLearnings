package com.code4u.springboot.demosecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource)
    {
        JdbcUserDetailsManager jdbcUDM=new JdbcUserDetailsManager(dataSource);
        jdbcUDM.setUsersByUsernameQuery("select user_id,pw,active from members where user_id=?");
        jdbcUDM.setAuthoritiesByUsernameQuery("select user_id,role from roles where user_id=?");
        return jdbcUDM;
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)
    {
        http.authorizeHttpRequests(configurer->
                configurer.requestMatchers("/").hasAnyRole("EMPLOYEE")
                        .requestMatchers("/leaders/**").hasAnyRole("MANAGER")
                        .requestMatchers("/admin/**").hasAnyRole("ADMIN")
                        .anyRequest().authenticated())
                .formLogin(
                        form-> form
                                        .loginPage("/showMyLoginPage")
                                        .loginProcessingUrl("/authenticateTheUser")
                                        .permitAll()

                )
                .logout(logout->logout.permitAll()
                ).exceptionHandling(configurer->
                        configurer.accessDeniedPage("/access-denied"));
        return http.build();
    }

    /*
    * @Bean
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
        UserDetails susan=User.builder()
                .username("susan")
                .password("{noop}test789")
                .roles("EMPLOYEE","ADMIN")
                .build();
        return new InMemoryUserDetailsManager(john,mary,susan);
    }

    * */
}
