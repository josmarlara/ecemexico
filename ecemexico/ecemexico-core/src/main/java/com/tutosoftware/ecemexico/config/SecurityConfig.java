package com.tutosoftware.ecemexico.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	
	
	@Autowired
	@Qualifier("customUserDetailsService")
	UserDetailsService userDetailsService;
	
	@Autowired
	CustomSuccessHandler customSuccessHandler;
	
	
	
	
	@Autowired
	  protected void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("Estoy comprobando password");
		auth.userDetailsService(userDetailsService);
		auth.authenticationProvider(authenticationProvider());

	  }
	  
	 @Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
	  
	  
	  
	  
	  @Bean
		public DaoAuthenticationProvider authenticationProvider() {
		    DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		    authenticationProvider.setUserDetailsService(userDetailsService);
		    authenticationProvider.setPasswordEncoder(passwordEncoder());
		    return authenticationProvider;
		}
	 
	  @Override
	    protected void configure(HttpSecurity http) throws Exception {
		  http.authorizeRequests()
		 
		    .antMatchers("/", "/home").permitAll()
		  	.antMatchers("/menu","/registrarPaciente","/guardarPaciente","/mostrarPaciente",
		     "/buscarExpediente","/exportarExpediente","/buscarExpedienteId",
		     "/buscarExpedienteCurp","/buscarExpedienteNombre","/mostrarExpediente","/modificarDatosPersonales",
		     "/actualizarPaciente","/mostrarHistoriaClinica","/mostrarFormHistoria",
		     "/agregarHistoriaClinica","/mostrarHistoriaClinicaFecha","/mostrarNotasEvolucion",
		     "/mostrarFormNotas","/agregarNotaEvolucion","/mostrarNotaEvolucionFecha",
		     "/mostrarRecetas","/mostrarFormReceta","/mostrarRecetaNumero").access("hasRole('USER') or hasRole('ADMIN') ")
		  	.antMatchers("/registrarUsuarioForm","/guardarUsuario","/buscarUsuario",
		  	"/buscarUsuarioForm","/actualizarUsuarioForm","/actualizarUsuario",
		  	"/eliminarUsuario").access("hasRole('ADMIN')")
		  	//.and().formLogin().loginPage("/login")
		  	.and().formLogin().loginPage("/login").successHandler(customSuccessHandler)
		  	.usernameParameter("email").passwordParameter("password")
		  	.and().csrf()
		  	.and().exceptionHandling().accessDeniedPage("/acessoDenegado");
		  
		  
		  
		  
		  
		 
	    }
	  
	  
	 

}
