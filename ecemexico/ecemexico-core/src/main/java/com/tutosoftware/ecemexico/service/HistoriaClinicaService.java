package com.tutosoftware.ecemexico.service;

import java.time.LocalDateTime;

import java.util.List;

import com.tutosoftware.ecemexico.entity.HistoriaClinica;

public interface HistoriaClinicaService {
	
	public void guardarHistoriaClinica(HistoriaClinica historia);
	public List<HistoriaClinica> buscarHistoriaPorIdPaciente(String idPaciente);
	public HistoriaClinica buscarHistoriaPorIdPacienteFecha(String idPaciente,LocalDateTime fecha);

}
