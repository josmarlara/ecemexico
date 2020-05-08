package com.tutosoftware.ecemexico.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value="receta")
public class Receta {
	
	@PrimaryKeyColumn(name="id_paciente",type = PrimaryKeyType.PARTITIONED)
	String idPaciente;
	
	@PrimaryKeyColumn(name="numero_receta",type = PrimaryKeyType.PARTITIONED)
	String numeroReceta;
	
	@Column(value="nombre_doctor")
	String nombreDoctor;
	
	@Column(value="fecha")
	LocalDateTime fecha;
	
	@Column(value="medicamento")
	 Set<String> medicamento = new HashSet<>();
	
	@Column(value="dosis")
	 Set<String> dosis = new HashSet<>();
	
	@Column(value="duracion")
	 Set<String> duracion = new HashSet<>();
	
	@Column(value="notas")
	 Set<String> notas = new HashSet<>();

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNumeroReceta() {
		return numeroReceta;
	}

	public void setNumeroReceta(String numeroReceta) {
		this.numeroReceta = numeroReceta;
	}

	public String getNombreDoctor() {
		return nombreDoctor;
	}

	public void setNombreDoctor(String nombreDoctor) {
		this.nombreDoctor = nombreDoctor;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Set<String> getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Set<String> medicamento) {
		this.medicamento = medicamento;
	}

	public Set<String> getDosis() {
		return dosis;
	}

	public void setDosis(Set<String> dosis) {
		this.dosis = dosis;
	}

	public Set<String> getDuracion() {
		return duracion;
	}

	public void setDuracion(Set<String> duracion) {
		this.duracion = duracion;
	}

	public Set<String> getNotas() {
		return notas;
	}

	public void setNotas(Set<String> notas) {
		this.notas = notas;
	}

}
