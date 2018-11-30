package pl.mhordyjewicz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
    @Bean
    public UserDetailsService userDetailsService()
    {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin").password("myPassword").roles("ADMIN").build());
        return manager;
    }

    protected void configure(HttpSecurity http) throws Exception
    {
        http
                .authorizeRequests()
                .antMatchers("/adminpanel/**").hasRole("ADMIN")
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated()

                .and()
                .formLogin().loginPage("/adminpanel/login").permitAll()
                .failureUrl("/adminpanel/login?error")
                .defaultSuccessUrl("/adminpanel")

                .and()
                .logout()
                .logoutUrl("/adminpanel/logout")
                .logoutSuccessUrl("/adminpanel/login?logout")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")

                .and()
                .httpBasic();

        http
                .csrf().disable();
    }
}