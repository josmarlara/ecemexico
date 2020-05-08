package com.tutosoftware.ecemexico.service;

import java.util.List;

import com.tutosoftware.ecemexico.entity.Alergia;
import com.tutosoftware.ecemexico.entity.Paciente;
import com.tutosoftware.ecemexico.model.NombreCompleto;

public interface PacienteService {
	
	public void guardarPaciente(Paciente paciente);
	public void guardarAlergia(Alergia alergia);
	public Alergia mostrarAlergia(String idPaciente);
	public Paciente buscarExpedientePorIdPaciente(String idUsuario);
	public List<Paciente> buscarExpedientePorCurp(String curp);
	public List<Paciente> buscarExpedientePorNombre(NombreCompleto nc);
	public Paciente updatePaciente(Paciente paciente);
	public Alergia updateAlergia(Alergia alergia);
}
