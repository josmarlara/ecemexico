package com.tutosoftware.ecemexico.entity;


import java.util.HashSet;
import java.util.Set;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;



@Table(value="alergia")
public class Alergia {
	
	
	@PrimaryKey(value="id_paciente")
	 String idPaciente;
	
	@Column(value="nombres")
	 Set<String> nombres = new HashSet<>();
	
	

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Set<String> getNombres() {
		return nombres;
	}

	public void setNombres(Set<String> alergias) {
		this.nombres = alergias;
	}

	

}
