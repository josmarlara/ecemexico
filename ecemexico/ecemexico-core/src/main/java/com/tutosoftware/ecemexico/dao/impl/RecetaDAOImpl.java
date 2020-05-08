package com.tutosoftware.ecemexico.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutosoftware.ecemexico.dao.RecetaDAO;
import com.tutosoftware.ecemexico.entity.Receta;
import com.tutosoftware.ecemexico.util.CassandraUtil;


@Repository
public class RecetaDAOImpl implements RecetaDAO {
	
	
	@Autowired
	CassandraUtil cassandraUtil;

	@Override
	public void guardarReceta(Receta receta) {
		// TODO Auto-generated method stub
		cassandraUtil.create(receta);

	}

	@Override
	public List<Receta> buscarRecetaIdPaciente(String idPaciente) {
		// TODO Auto-generated method stub
		String cql= "select * from receta where id_paciente ='"+idPaciente+"' ALLOW FILTERING";
		List<Receta> recetas = cassandraUtil.findAll(cql,Receta.class);
		return recetas;
	}

	@Override
	public Receta buscarRecetaIdPacienteNumeroReceta(String idPaciente, String numero) {
		// TODO Auto-generated method stub
		String cql="select * from receta where id_paciente='"+idPaciente+"' and numero_receta ='"+numero+"' ";
		Receta receta = cassandraUtil.findOne(cql,Receta.class);
		return receta;
	}

}
