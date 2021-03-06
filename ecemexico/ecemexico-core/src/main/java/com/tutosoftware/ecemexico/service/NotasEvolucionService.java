package com.tutosoftware.ecemexico.service;

import java.time.LocalDateTime;
import java.util.List;

import com.tutosoftware.ecemexico.entity.NotasEvolucion;

public interface NotasEvolucionService {
	
	public void guardarNotasEvolucion(NotasEvolucion nota);
	public List<NotasEvolucion> buscarNotasPorIdPaciente(String idPaciente);
	public NotasEvolucion buscarNotaPorIdPacienteFecha(String idPaciente,LocalDateTime fecha);

}
