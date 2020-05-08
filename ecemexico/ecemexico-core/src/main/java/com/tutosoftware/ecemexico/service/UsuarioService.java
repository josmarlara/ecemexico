package com.tutosoftware.ecemexico.service;

import com.tutosoftware.ecemexico.entity.Usuario;

public interface UsuarioService {
	
	
	
	public Usuario obtenerUsuario(String email);
	public void guardarUsuario(Usuario usuario);
	public Usuario updateUsuario(Usuario usuario);
	public void deleteUsuario(String email);

}
