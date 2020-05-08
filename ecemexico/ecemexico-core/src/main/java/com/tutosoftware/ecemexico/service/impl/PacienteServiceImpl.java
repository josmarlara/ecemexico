package com.tutosoftware.ecemexico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutosoftware.ecemexico.dao.PacienteDAO;
import com.tutosoftware.ecemexico.entity.Alergia;
import com.tutosoftware.ecemexico.entity.Paciente;
import com.tutosoftware.ecemexico.model.NombreCompleto;
import com.tutosoftware.ecemexico.service.PacienteService;


@Service
@Transactional
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	PacienteDAO pacienteDAO;

	@Override
	public void guardarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		pacienteDAO.guardarPaciente(paciente);

	}
	
	@Override
	public void guardarAlergia(Alergia alergia){
		pacienteDAO.guardarAlergia(alergia);
	}
	@Override
	public Alergia mostrarAlergia(String idPaciente) {
		return pacienteDAO.mostrarAlergia(idPaciente);
		
	}
	
	@Override
	public Paciente buscarExpedientePorIdPaciente(String idUsuario) {
		 
		  return pacienteDAO.buscarExpedientePorIdPaciente(idUsuario);	
		}
	@Override
	public List<Paciente> buscarExpedientePorCurp(String curp){
		return pacienteDAO.buscarExpedientePorCurp(curp);
		
	}
	@Override
	public List<Paciente> buscarExpedientePorNombre(NombreCompleto nc){
		return pacienteDAO.buscarExpedientePorNombre(nc);
	}
	@Override
	public Paciente updatePaciente(Paciente paciente) {
		return pacienteDAO.updatePaciente(paciente);
	}
	@Override
	public Alergia updateAlergia(Alergia alergia) {
		return pacienteDAO.updateAlergia(alergia);
	}

}
