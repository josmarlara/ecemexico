package com.tutosoftware.ecemexico.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutosoftware.ecemexico.dao.HistoriaClinicaDAO;
import com.tutosoftware.ecemexico.entity.HistoriaClinica;
import com.tutosoftware.ecemexico.service.HistoriaClinicaService;

@Service
@Transactional
public class HistoriaClinicaServiceImpl implements HistoriaClinicaService {
	
	@Autowired
	HistoriaClinicaDAO historiaClinicaDAO;

	@Override
	public void guardarHistoriaClinica(HistoriaClinica historia) {
		// TODO Auto-generated method stub
		
		historiaClinicaDAO.guardarHistoriaClinica(historia);

	}
	@Override
	public List<HistoriaClinica> buscarHistoriaPorIdPaciente(String idPaciente){
		return historiaClinicaDAO.buscarHistoriaPorIdPaciente(idPaciente);
	}
	@Override
	public HistoriaClinica buscarHistoriaPorIdPacienteFecha(String idPaciente,LocalDateTime fecha) {
		return historiaClinicaDAO.buscarHistoriaPorIdPacienteFecha(idPaciente, fecha);
	}

}
