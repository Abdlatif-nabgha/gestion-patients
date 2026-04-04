package com.nabgha.patientsapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        String encodedPassword = passwordEncoder().encode("44026676");
        return new InMemoryUserDetailsManager(
                User.withUsername("Mohamed").password(encodedPassword).roles("USER").build(),
                User.withUsername("Abdellatif").password(encodedPassword).roles("USER").build(),
                User.withUsername("Nabgha").password(encodedPassword).roles("USER", "ADMIN").build()
        );
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.formLogin(f -> f.loginPage("/login").permitAll());
        
        httpSecurity.authorizeHttpRequests(ar -> ar
                .requestMatchers("/webjars/**", "/h2-console/**").permitAll()
                .requestMatchers("/user/**").hasRole("USER")
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
        );

        httpSecurity.exceptionHandling(e -> e.accessDeniedPage("/notAuthorized"));

        return httpSecurity.build();
    }
}
