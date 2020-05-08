package com.tutosoftware.ecemexico.dao;

import java.util.List;


import com.tutosoftware.ecemexico.entity.Receta;

public interface RecetaDAO {
	
	
	public void guardarReceta(Receta receta);
	public List<Receta> buscarRecetaIdPaciente(String idPaciente);
	public Receta buscarRecetaIdPacienteNumeroReceta(String idPaciente,String numero);

}
