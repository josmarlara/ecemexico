package com.tutosoftware.ecemexico.entity;

import java.time.LocalDateTime;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value="notasevolucion")
public class NotasEvolucion {
	
	@PrimaryKeyColumn(name="id_paciente",type = PrimaryKeyType.PARTITIONED)
	String idPaciente;
	
	@PrimaryKeyColumn(name="fecha",type = PrimaryKeyType.PARTITIONED)
    LocalDateTime fecha;
	
	@Column(value="unidad_medica")
	String unidadMedica;
	
	@Column(value="edad")
	String edad;
	
	@Column(value="notas_evolucion")
	String notasEvolucion;

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getUnidadMedica() {
		return unidadMedica;
	}

	public void setUnidadMedica(String unidadMedica) {
		this.unidadMedica = unidadMedica;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNotasEvolucion() {
		return notasEvolucion;
	}

	public void setNotasEvolucion(String notasEvolucion) {
		this.notasEvolucion = notasEvolucion;
	}

}
