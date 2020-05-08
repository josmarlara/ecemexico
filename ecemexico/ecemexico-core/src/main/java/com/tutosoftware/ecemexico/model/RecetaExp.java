package com.tutosoftware.ecemexico.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;


public class RecetaExp {
	
	
	
	String idPaciente;
	String numeroReceta;
	String nombreDoctor;
	LocalDateTime fecha;
	List<String> medicamento = new ArrayList<String>();
	List<String> dosis = new ArrayList<String>();
	List<String> duracion = new ArrayList<String>();
	List<String> notas = new ArrayList<String>();
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
	public List<String> getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(List<String> medicamento) {
		this.medicamento = medicamento;
	}
	public List<String> getDosis() {
		return dosis;
	}
	public void setDosis(List<String> dosis) {
		this.dosis = dosis;
	}
	public List<String> getDuracion() {
		return duracion;
	}
	public void setDuracion(List<String> duracion) {
		this.duracion = duracion;
	}
	public List<String> getNotas() {
		return notas;
	}
	public void setNotas(List<String> notas) {
		this.notas = notas;
	}

}
