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
            .antMatchers("/actuator/**").permitAll() // Actuator 엔드포인트에 대한 접근 허용
            .anyRequest().authenticated()
            .and()
            .formLogin().and()
            .httpBasic();
        return http.build();
    }
}