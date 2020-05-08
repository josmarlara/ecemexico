package com.tutosoftware.ecemexico.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value="usuario")
public class Usuario {
	
	 
	 
	 
	 @Column(value="cedula")
	 String cedula;
	 
	 @Column(value="curp")
	 String curp;
	 
	 @Column(value="nombre")
	 String nombre;
	 
	 @Column(value="apellido_paterno")
	 String apellidoPaterno;
	 
	 @Column(value="apellido_materno")
	 String apellidoMaterno;
	 
	 
	 @Column(value="especialidad")
	 String especialidad;
	 
	 @Column(value="sub_especialidad")
	 String subEspecialidad;
	 
	 @Column(value="clues")
	 String clues;
	 
	 @PrimaryKey(value="email")
	 String email;
	 
	 @Column(value="password")
	 String password;
	 
	 
	 @Column(value="rol")
	 String rol;


	


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getCurp() {
		return curp;
	}


	public void setCurp(String curp) {
		this.curp = curp;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidoPaterno() {
		return apellidoPaterno;
	}


	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}


	public String getApellidoMaterno() {
		return apellidoMaterno;
	}


	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public String getSubEspecialidad() {
		return subEspecialidad;
	}


	public void setSubEspecialidad(String subEspecialidad) {
		this.subEspecialidad = subEspecialidad;
	}


	public String getClues() {
		return clues;
	}


	public void setClues(String clues) {
		this.clues = clues;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}
	 

}
