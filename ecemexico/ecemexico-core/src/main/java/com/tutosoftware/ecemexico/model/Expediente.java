package com.tutosoftware.ecemexico.model;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;



public class Expediente {
	
	
	
	
	
	     String idUsuario;
		 String curp;
		@NotEmpty(message = "{expediente.nombre.empty}")
		 String nombre;
		@NotEmpty(message = "{expediente.apellidoPaterno.empty}")
		 String apellidoPaterno;
		 String apellidoMaterno;
		 String nivelSocioeconomico;
		 String vivienda;
		 int tipoSangre;
		 String discapacidad;
		 String grupoEtnico;
		 String religion;
		 @NotEmpty(message = "{expediente.sexo.empty}")
		 String sexo;
		 int edad;
		 @NotEmpty(message = "{expediente.calle.empty}")
		 String calle;
		 @NotEmpty(message = "{expediente.numeroExterior.empty}")
		 String numeroExterior;
		 String numeroInterior;
		 @NotEmpty(message = "{expediente.estado.empty}")
		 String estado;
		 @NotEmpty(message = "{expediente.municipio.empty}")
		 String municipio;
		 String localidad;
		 @NotEmpty(message = "{expediente.colonia.empty}")
		 String colonia;
		int codigoPostal;
		 String telefonoFijo;
		 String telefonoMovil;
	     List<String> alergias =new ArrayList<String>();
	     List<String> alergias2 =new ArrayList<String>();
	    
		public String getIdUsuario() {
			return idUsuario;
		}
		public void setIdUsuario(String idUsuario) {
			this.idUsuario = idUsuario;
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
		public String getNivelSocioeconomico() {
			return nivelSocioeconomico;
		}
		public void setNivelSocioeconomico(String nivelSocioeconomico) {
			this.nivelSocioeconomico = nivelSocioeconomico;
		}
		public String getVivienda() {
			return vivienda;
		}
		public void setVivienda(String vivienda) {
			this.vivienda = vivienda;
		}
		public int getTipoSangre() {
			return tipoSangre;
		}
		public void setTipoSangre(int tipoSangre) {
			this.tipoSangre = tipoSangre;
		}
		public String getDiscapacidad() {
			return discapacidad;
		}
		public void setDiscapacidad(String discapacidad) {
			this.discapacidad = discapacidad;
		}
		public String getGrupoEtnico() {
			return grupoEtnico;
		}
		public void setGrupoEtnico(String grupoEtnico) {
			this.grupoEtnico = grupoEtnico;
		}
		public String getReligion() {
			return religion;
		}
		public void setReligion(String religion) {
			this.religion = religion;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getCalle() {
			return calle;
		}
		public void setCalle(String calle) {
			this.calle = calle;
		}
		public String getNumeroExterior() {
			return numeroExterior;
		}
		public void setNumeroExterior(String numeroExterior) {
			this.numeroExterior = numeroExterior;
		}
		public String getNumeroInterior() {
			return numeroInterior;
		}
		public void setNumeroInterior(String numeroInterior) {
			this.numeroInterior = numeroInterior;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getMunicipio() {
			return municipio;
		}
		public void setMunicipio(String municipio) {
			this.municipio = municipio;
		}
		public String getLocalidad() {
			return localidad;
		}
		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}
		public String getColonia() {
			return colonia;
		}
		public void setColonia(String colonia) {
			this.colonia = colonia;
		}
		public int getCodigoPostal() {
			return codigoPostal;
		}
		public void setCodigoPostal(int codigoPostal) {
			this.codigoPostal = codigoPostal;
		}
		public String getTelefonoFijo() {
			return telefonoFijo;
		}
		public void setTelefonoFijo(String telefonoFijo) {
			this.telefonoFijo = telefonoFijo;
		}
		public String getTelefonoMovil() {
			return telefonoMovil;
		}
		public void setTelefonoMovil(String telefonoMovil) {
			this.telefonoMovil = telefonoMovil;
		}
	public List<String> getAlergias() {
		return alergias;
	}
	public void setAlergias(List<String> alergias) {
		this.alergias = alergias;
	}
	
	public List<String> getAlergias2() {
		return alergias2;
	}
	public void setAlergias2(List<String> alergias2) {
		this.alergias2 = alergias2;
	}
}
