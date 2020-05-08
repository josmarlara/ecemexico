package com.tutosoftware.ecemexico.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutosoftware.ecemexico.dao.NotasEvolucionDAO;
import com.tutosoftware.ecemexico.entity.NotasEvolucion;
import com.tutosoftware.ecemexico.service.NotasEvolucionService;

@Service
@Transactional
public class NotasEvolucionServiceImpl implements NotasEvolucionService {
	
	@Autowired
	NotasEvolucionDAO notasEvolucionDAO;

	@Override
	public void guardarNotasEvolucion(NotasEvolucion nota) {
		// TODO Auto-generated method stub
		notasEvolucionDAO.guardarNotasEvolucion(nota);

	}

	@Override
	public List<NotasEvolucion> buscarNotasPorIdPaciente(String idPaciente) {
		// TODO Auto-generated method stub
		
		return notasEvolucionDAO.buscarNotasPorIdPaciente(idPaciente);
	}

	@Override
	public NotasEvolucion buscarNotaPorIdPacienteFecha(String idPaciente, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return notasEvolucionDAO.buscarNotaPorIdPacienteFecha(idPaciente, fecha);
	}

}
