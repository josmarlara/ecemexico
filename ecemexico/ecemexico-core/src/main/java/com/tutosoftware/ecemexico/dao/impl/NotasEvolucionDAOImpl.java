package com.tutosoftware.ecemexico.dao.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutosoftware.ecemexico.dao.NotasEvolucionDAO;
import com.tutosoftware.ecemexico.entity.NotasEvolucion;
import com.tutosoftware.ecemexico.util.CassandraUtil;

@Repository
public class NotasEvolucionDAOImpl implements NotasEvolucionDAO {
	
	@Autowired
	CassandraUtil cassandraUtil;
	

	@Override
	public void guardarNotasEvolucion(NotasEvolucion nota) {
		// TODO Auto-generated method stub
		cassandraUtil.create(nota);

	}

	@Override
	public List<NotasEvolucion> buscarNotasPorIdPaciente(String idPaciente) {
		// TODO Auto-generated method stub
		String cql= "select * from notasevolucion where id_paciente ='"+idPaciente+"' ALLOW FILTERING";
		List<NotasEvolucion> notas = cassandraUtil.findAll(cql,NotasEvolucion.class);
		return notas;
	}

	@Override
	public NotasEvolucion buscarNotaPorIdPacienteFecha(String idPaciente, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		String cql="select * from notasevolucion where id_paciente='"+idPaciente+"' and fecha ='"+fecha+"' ";
		NotasEvolucion nota = cassandraUtil.findOne(cql,NotasEvolucion.class);
		return nota;
	}

}
