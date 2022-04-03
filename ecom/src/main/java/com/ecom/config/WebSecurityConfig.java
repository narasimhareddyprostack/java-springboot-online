package com.ecom.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{ 
	
	
	protected void configure(HttpSecurity http) throws Exception {
	http.cors().and()
	           .authorizeHttpRequests()
	           .antMatchers("/api/user/**").hasRole("USER")
	           .antMatchers("/api/admin/**").hasRole("ADMIN")
	           .anyRequest().authenticated()
	           .and()
	           .formLogin().loginPage("/api/user/login").and()
	           .httpBasic().and()
	           .csrf().disable();       
	}
	
	//cross origin resource sharing 
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
			}
			
		};
	}
	
}
