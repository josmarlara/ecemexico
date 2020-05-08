package com.tutosoftware.ecemexico.dao;


import com.tutosoftware.ecemexico.entity.Usuario;

public interface UsuarioDAO {
	
	
	public Usuario obtenerUsuario(String email);
	public void guardarUsuario(Usuario usuario);
	public Usuario updateUsuario(Usuario usuario);
	public void deleteUsuario(String email);
	
	

}
