package com.generartion.MinhaRedeSocial.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	
	private UserDetailsService userDetailsService; //importando da classe webSecurityCOnfigurerAdapter
	
	@Override
	protected void configure (AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure (HttpSecurity http)  throws Exception{
		http.authorizeRequests()
		.antMatchers("/usuarios/logar").permitAll() //liberar endpoint dentro do controller para que o client 
		.antMatchers("/usuarios/cadastrar").permitAll() //tenha acesso sem chave token
		.anyRequest().authenticated() // as demais requesições precisam de atutenticação.
		.and().httpBasic() // utilizar padrao basic para gerar chave token
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // indicar o tipo de sessão. Stateless não guarda sessão nenhuma.
		.and().cors() // para habilitar o cors dentro da camada de security
		.and().csrf().disable(); //desabilitar o csrf. utilizar configuração padrão.
	}

}
