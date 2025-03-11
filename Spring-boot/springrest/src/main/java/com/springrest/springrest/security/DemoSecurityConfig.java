package com.springrest.springrest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource datasource){

        JdbcUserDetailsManager jdbcUserDetailsManager= new JdbcUserDetailsManager(datasource);

        //define query to retrieve a user by username
        jdbcUserDetailsManager.setUsersByUsernameQuery(
                "select username, password, enabled from members where username=?");

        //define query to retrieve the authorities/roles by username
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
                "select username, role from roles where username=?");

        return jdbcUserDetailsManager;
    }



    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer->
                configurer
                        .requestMatchers(HttpMethod.GET, "/courses").hasRole("STUDENT")
                        .requestMatchers(HttpMethod.GET, "/courses/**").hasRole("STUDENT")
                        .requestMatchers(HttpMethod.POST, "/courses").hasRole("FACULTY")
                        .requestMatchers(HttpMethod.PUT, "/courses").hasRole("FACULTY")
                        .requestMatchers(HttpMethod.DELETE, "/courses").hasRole("ADMIN"));

        //use HTTP Basic Authentication
        http.httpBasic(Customizer.withDefaults());

        //disable cross site Request Forgery (CSRF)
        http.csrf(AbstractHttpConfigurer::disable);

       return http.build();

    }

       /* @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails Disha= User.builder()
                .username("Disha")
                .password("{noop}test123")
                .roles("Student")
                .build();


        UserDetails Alice= User.builder()
                .username("Alice")
                .password("{noop}test123")
                .roles("Faculty")
                .build();

        UserDetails Lea= User.builder()
                .username("Lea")
                .password("{noop}test123")
                .roles("Student", "Faculty","Admin")
                .build();

        return new InMemoryUserDetailsManager(Disha, Alice, Lea);


    }*/
}
