package com.tutosoftware.ecemexico.dao.impl;


import java.time.LocalDateTime;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutosoftware.ecemexico.dao.HistoriaClinicaDAO;
import com.tutosoftware.ecemexico.entity.HistoriaClinica;
import com.tutosoftware.ecemexico.util.CassandraUtil;

@Repository
public class HistoriaClinicaDAOImpl implements HistoriaClinicaDAO {
	
	@Autowired
	CassandraUtil cassandraUtil;

	@Override
	public void guardarHistoriaClinica(HistoriaClinica historia) {
		// TODO Auto-generated method stub
		cassandraUtil.create(historia);
	}
	
	@Override
	public List<HistoriaClinica> buscarHistoriaPorIdPaciente(String idPaciente){
		
		
		String cql= "select * from historiaclinica where id_paciente ='"+idPaciente+"' ALLOW FILTERING";
		List<HistoriaClinica> historias = cassandraUtil.findAll(cql,HistoriaClinica.class);
		return historias;
		
	}
	
	
	@Override
	public HistoriaClinica buscarHistoriaPorIdPacienteFecha(String idPaciente,LocalDateTime fecha) {
		
		
		
		
		String cql="select * from historiaclinica where id_paciente='"+idPaciente+"' and fecha ='"+fecha+"' ";
		System.out.println(cql);
		HistoriaClinica historia = cassandraUtil.findOne(cql,HistoriaClinica.class);
		return historia;
	}
	
	
	

	

}
