package com.tutosoftware.ecemexico.service;

import java.util.List;

import com.tutosoftware.ecemexico.entity.Receta;

public interface RecetaService {
	
	public void guardarReceta(Receta receta);
	public List<Receta> buscarRecetaIdPaciente(String idPaciente);
	public Receta buscarRecetaIdPacienteNumeroReceta(String idPaciente,String numero);

}
