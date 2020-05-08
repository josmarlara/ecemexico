package com.tutosoftware.ecemexico.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutosoftware.ecemexico.dao.UsuarioDAO;
import com.tutosoftware.ecemexico.entity.Usuario;
import com.tutosoftware.ecemexico.service.UsuarioService;


@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public Usuario obtenerUsuario(String email) {
		// TODO Auto-generated method stub
         System.out.println("email service:"+email);
		return usuarioDAO.obtenerUsuario(email);
	}
    @Override
    public void guardarUsuario(Usuario usuario) {
    	usuarioDAO.guardarUsuario(usuario);
    }
    @Override
    public Usuario updateUsuario(Usuario usuario) {
    	return usuarioDAO.updateUsuario(usuario);
    }
    @Override
    public void deleteUsuario(String email) {
    	usuarioDAO.deleteUsuario(email);
    }
}
