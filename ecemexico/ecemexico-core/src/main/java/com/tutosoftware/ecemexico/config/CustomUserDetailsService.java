package com.tutosoftware.ecemexico.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tutosoftware.ecemexico.entity.Usuario;
import com.tutosoftware.ecemexico.service.UsuarioService;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{
	
	
	
	@Autowired
	UsuarioService   usuarioService;
	
	
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String email)
			throws UsernameNotFoundException {
		System.out.println("email : "+email);
		Usuario usuario = usuarioService.obtenerUsuario(email);
		System.out.println("User : "+usuario);
		if(usuario==null){
			System.out.println("Usuario no funciona");
			throw new UsernameNotFoundException("Usuario no funciona");
		}
			return new org.springframework.security.core.userdetails.User(usuario.getEmail(),usuario.getPassword(),true,
					true,true,true,getGrantedAuthorities(usuario));
					
					
					
					
					
					
	}
	
	private List<GrantedAuthority> getGrantedAuthorities(Usuario usuario){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		
			authorities.add(new SimpleGrantedAuthority("ROLE_"+usuario.getRol()));
		
		
		return authorities;
	}
}
