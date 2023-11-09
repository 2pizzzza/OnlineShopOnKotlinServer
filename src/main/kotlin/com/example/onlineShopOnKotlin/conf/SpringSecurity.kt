import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {

        http.authorizeHttpRequests {
            it.requestMatchers("/greeter/**", "/csrf_token").permitAll()
            it.anyRequest().authenticated()
        }.formLogin {
            it.loginProcessingUrl("/login").permitAll()
            it.usernameParameter("email")
            it.passwordParameter("pass")
        }.logout {
            it.logoutUrl("/logout")
            it.invalidateHttpSession(true)
            it.deleteCookies("SESSION")
        }.exceptionHandling {
        }.csrf {
        }.cors {
        }
        return http.build()
    }

}
