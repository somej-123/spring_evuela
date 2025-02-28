package com.home.evuela;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest().permitAll() // 모든 요청에 대한 접근 허용
            .and()
            .csrf().disable(); // CSRF 비활성화 (선택 사항)
        return http.build();
    }
}