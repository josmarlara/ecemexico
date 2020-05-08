package com.tutosoftware.ecemexico.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutosoftware.ecemexico.dao.UsuarioDAO;
import com.tutosoftware.ecemexico.entity.Usuario;
import com.tutosoftware.ecemexico.util.CassandraUtil;


@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
     
	@Autowired
	CassandraUtil cassandraUtil;
	
	
	
	
	
	@Override
	public Usuario obtenerUsuario(String email) {
		// TODO Auto-generated method stub
		System.out.println("email dao:"+email);
		String cql = "select * from usuario where email = '"+email+"'";
		Usuario usuario = cassandraUtil.findOne(cql,Usuario.class);
		
		
		System.out.println("Usuario nombre:"+usuario.getNombre());
		
		
		return usuario; 
	}
	
	@Override
	public void guardarUsuario(Usuario usuario) {
		cassandraUtil.create(usuario);
	}
	
	@Override
	public Usuario updateUsuario(Usuario usuario) {
		return cassandraUtil.update(usuario);
	}
	@Override
	public void deleteUsuario(String email) {
		cassandraUtil.deleteById(email, Usuario.class);
	}

}
