package com.tutosoftware.ecemexico.dao.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutosoftware.ecemexico.dao.PacienteDAO;
import com.tutosoftware.ecemexico.entity.Alergia;
import com.tutosoftware.ecemexico.entity.Paciente;
import com.tutosoftware.ecemexico.model.NombreCompleto;
import com.tutosoftware.ecemexico.util.CassandraUtil;

@Repository
public class PacienteDAOImpl implements PacienteDAO{
	
	@Autowired
	CassandraUtil cassandraUtil;
	
	
	@Override
	public void guardarPaciente(Paciente paciente){
		cassandraUtil.create(paciente);
	}
	
	@Override
	public Alergia mostrarAlergia(String idPaciente) {
		Alergia alergia = cassandraUtil.findById(idPaciente,Alergia.class);
		return alergia;
	}
	
	@Override
	public void guardarAlergia(Alergia alergia){
		cassandraUtil.create(alergia);
	}
	
	@Override
	public Paciente buscarExpedientePorIdPaciente(String idUsuario) {
		Paciente paciente = new Paciente();
		UUID uid = UUID.fromString(idUsuario); 
		paciente = cassandraUtil.findById(uid, Paciente.class);
		
		return paciente;
		
	}
	@Override
	public List<Paciente> buscarExpedientePorCurp(String curp){
		
		String cql= "select * from paciente where curp ='"+curp+"' ALLOW FILTERING";
		List<Paciente> pacientes = cassandraUtil.findAll(cql,Paciente.class);
		return pacientes;
	}
	@Override
	public List<Paciente> buscarExpedientePorNombre(NombreCompleto nc){
		String cql= "select * from paciente where nombre='"+nc.getNombre()+"' and apellido_paterno='"+
	    nc.getApellidoPaterno()+"' and apellido_materno='"+nc.getApellidoMaterno()+"' ALLOW FIlTERING";
		List<Paciente> pacientes = cassandraUtil.findAll(cql,Paciente.class);
		return pacientes;
					
	}
	@Override
	public Paciente updatePaciente(Paciente paciente) {
		return cassandraUtil.update(paciente);
	}
	@Override
	public Alergia updateAlergia(Alergia alergia) {
		return cassandraUtil.update(alergia);
	}
	

}
