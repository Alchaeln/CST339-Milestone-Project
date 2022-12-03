package com.gcu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter 
{
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.csrf().disable()
			.authorizeRequests()
				.antMatchers("/", "/images/**", "/service/**", "/register/**").permitAll() //unprotected list
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.usernameParameter("username")
                .passwordParameter("password")
				.permitAll()
				.defaultSuccessUrl("/order/display", true) //shows the form with this
				.and()
			.logout()
				.logoutUrl("/logout")
				.invalidateHttpSession(true)
				.clearAuthentication(true)
				.permitAll()
				.logoutSuccessUrl("/"); //after logout takes us to here
	}
	
    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication()
                .withUser("test").password("{noop}test").roles("USER"); //in memory authentication password with no ecryption
    }
}












