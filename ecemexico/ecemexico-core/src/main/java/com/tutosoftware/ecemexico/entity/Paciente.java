package com.tutosoftware.ecemexico.entity;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.driver.core.DataType;

@Table(value="paciente")
public class Paciente {
	
	@CassandraType (type =DataType.Name.UUID)
	@PrimaryKey(value="id_paciente")
	 String idUsuario;
	
	@Column(value="curp")
	 String curp;
	
	
	@Column(value="nombre")
	 String nombre;
	
	@Column(value="apellido_paterno")
	 String apellidoPaterno;
	
	@Column(value="apellido_materno")
	 String apellidoMaterno;
	
	@Column(value="nivel_socioeconomico")
	 String nivelSocioeconomico;
	
	@Column(value="vivienda")
	 String vivienda;
	
	@Column(value="tipo_sangre")
	 int tipoSangre;
	
	@Column(value="discapacidad")
	 String discapacidad;
	
	@Column(value="grupo_etnico")
	 String grupoEtnico;
	
	@Column(value="religion")
	 String religion;
	
	@Column(value="sexo")
	 String sexo;
	
	@Column(value="edad")
	int edad;
	
	@Column(value="calle")
	 String calle;
	
	@Column(value="numero_exterior")
	 String numeroExterior;
	
	@Column(value="numero_interior")
	 String numeroInterior;
	
	@Column(value="estado")
	 String estado;
	
	@Column(value="municipio")
	 String municipio;
	
	@Column(value="localidad")
	 String localidad;
	
	@Column(value="colonia")
	 String colonia;
	
	@Column(value="codigo_postal")
	 int codigoPostal;
	
	@Column(value="telefono_fijo")
	 String telefonoFijo;
	
	@Column(value="telefono_movil")
	 String telefonoMovil;

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

	}
