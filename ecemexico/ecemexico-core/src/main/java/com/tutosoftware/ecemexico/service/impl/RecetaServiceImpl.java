package com.tutosoftware.ecemexico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutosoftware.ecemexico.dao.RecetaDAO;
import com.tutosoftware.ecemexico.entity.Receta;
import com.tutosoftware.ecemexico.service.RecetaService;


@Service
@Transactional
public class RecetaServiceImpl implements RecetaService {
	
	@Autowired
	RecetaDAO recetaDAO;

	@Override
	public void guardarReceta(Receta receta) {
		// TODO Auto-generated method stub
		recetaDAO.guardarReceta(receta);

	}

	@Override
	public List<Receta> buscarRecetaIdPaciente(String idPaciente) {
		// TODO Auto-generated method stub
		return recetaDAO.buscarRecetaIdPaciente(idPaciente);
	}

	@Override
	public Receta buscarRecetaIdPacienteNumeroReceta(String idPaciente, String numero) {
		// TODO Auto-generated method stub
		return recetaDAO.buscarRecetaIdPacienteNumeroReceta(idPaciente, numero);
	}

}
