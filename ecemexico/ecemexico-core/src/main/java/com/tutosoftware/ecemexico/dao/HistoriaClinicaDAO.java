package com.tutosoftware.ecemexico.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.tutosoftware.ecemexico.entity.HistoriaClinica;


public interface HistoriaClinicaDAO {
	
	public void guardarHistoriaClinica(HistoriaClinica historia);
	public List<HistoriaClinica> buscarHistoriaPorIdPaciente(String idPaciente);
	public HistoriaClinica buscarHistoriaPorIdPacienteFecha(String idPaciente,LocalDateTime fecha);
	
	

}
