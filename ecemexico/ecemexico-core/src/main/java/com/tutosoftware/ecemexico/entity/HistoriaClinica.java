package com.tutosoftware.ecemexico.entity;

import java.time.LocalDateTime;


import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value="historiaclinica")
public class HistoriaClinica {
	
	@PrimaryKeyColumn(name="id_paciente",type = PrimaryKeyType.PARTITIONED)
	String idPaciente;
	
	@PrimaryKeyColumn(name="fecha",type = PrimaryKeyType.PARTITIONED)
    LocalDateTime fecha;
	
	@Column(value="unidad_medica")
	String unidadMedica;
	
	@Column(value="interrogatorio")
	String interrogatorio;
	
	@Column(value="ocupacion")
	String ocupacion;
	
	@Column(value="tutor")
	String tutor;
	
	@Column(value="parentesco")
	String parentesco;
	
	@Column(value="enfermedades_hereditarias")
	String enfermedadesHereditarias;
	
	@Column(value="antecedentes_personales_no_patologicos")
	String antecedentesPersonalesNoPatologicos;
	
	@Column(value="antecedentes_personales_patologicos")
	String antecedentesPersonalesPatologicos;
	
	@Column(value="antecedentes_gineco_obstetricos")
	String antecedentesGinecoObstetricos;
	
	@Column(value="padecimiento_actual")
	String padecimientoActual;
	
	@Column(value="sintomas_cardiovasculares")
	String sintomasCardiovasculares;
	
	@Column(value="sintomas_respiratorios")
	String sintomasRespiratorios;
	
	@Column(value="sintomas_gastrointestinal")
	String sintomasGastrointestinal;
	
	@Column(value="sintomas_genitourinarios")
	String sintomasGenitourinarios;
	
	@Column(value="sintomas_hematico_linfatico")
	String sintomasHematicoLinfatico;
	
	@Column(value="sintomas_endocrinos")
	String sintomasEndocrinos;
	
	@Column(value="sintomas_sistema_nervioso")
	String sintomasSistemaNervioso;
	
	@Column(value="sintomas_musculo_esqueleticos")
	String sintomasMusculoEsqueleticos;
	
	@Column(value="sintomas_piel_mucosas_anexos")
	String sintomasPielMucosasAnexos;
	
	@Column(value="tension_arterial")
	String tensionArterial;
	
	@Column(value="temperatura")
	String temperatura;
	
	@Column(value="frecuencia_cardiaca")
	String frecuenciaCardiaca;
	
	@Column(value="frecuencia_respiratoria")
	String frecuenciaRespiratoria;
	
	@Column(value="peso")
	String peso;
	
	@Column(value="talla")
	String talla;
	
	@Column(value="glucosa")
	String glucosa;
	
	@Column(value="exploracion_fisica")
	String exploracionFisica;
	
	@Column(value="resultados_ant_act_laboratorio")
	String resultadosAntActLaboratorio;
	
	@Column(value="diagnostico")
	String diagnostico;
	
	@Column(value="farmacologico")
	String farmacologico;
	
	@Column(value="pronostico")
	String pronostico;
	
	@Column(value="nombre_medico")
	String nombreMedico;
	
	@Column(value="cargo")
	String cargo;

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

	public String getInterrogatorio() {
		return interrogatorio;
	}

	public void setInterrogatorio(String interrogatorio) {
		this.interrogatorio = interrogatorio;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getEnfermedadesHereditarias() {
		return enfermedadesHereditarias;
	}

	public void setEnfermedadesHereditarias(String enfermedadesHereditarias) {
		this.enfermedadesHereditarias = enfermedadesHereditarias;
	}

	public String getAntecedentesPersonalesNoPatologicos() {
		return antecedentesPersonalesNoPatologicos;
	}

	public void setAntecedentesPersonalesNoPatologicos(String antecedentesPersonalesNoPatologicos) {
		this.antecedentesPersonalesNoPatologicos = antecedentesPersonalesNoPatologicos;
	}

	public String getAntecedentesPersonalesPatologicos() {
		return antecedentesPersonalesPatologicos;
	}

	public void setAntecedentesPersonalesPatologicos(String antecedentesPersonalesPatologicos) {
		this.antecedentesPersonalesPatologicos = antecedentesPersonalesPatologicos;
	}

	public String getAntecedentesGinecoObstetricos() {
		return antecedentesGinecoObstetricos;
	}

	public void setAntecedentesGinecoObstetricos(String antecedentesGinecoObstetricos) {
		this.antecedentesGinecoObstetricos = antecedentesGinecoObstetricos;
	}

	public String getPadecimientoActual() {
		return padecimientoActual;
	}

	public void setPadecimientoActual(String padecimientoActual) {
		this.padecimientoActual = padecimientoActual;
	}

	public String getSintomasCardiovasculares() {
		return sintomasCardiovasculares;
	}

	public void setSintomasCardiovasculares(String sintomasCardiovasculares) {
		this.sintomasCardiovasculares = sintomasCardiovasculares;
	}

	public String getSintomasRespiratorios() {
		return sintomasRespiratorios;
	}

	public void setSintomasRespiratorios(String sintomasRespiratorios) {
		this.sintomasRespiratorios = sintomasRespiratorios;
	}

	public String getSintomasGastrointestinal() {
		return sintomasGastrointestinal;
	}

	public void setSintomasGastrointestinal(String sintomasGastrointestinal) {
		this.sintomasGastrointestinal = sintomasGastrointestinal;
	}

	public String getSintomasGenitourinarios() {
		return sintomasGenitourinarios;
	}

	public void setSintomasGenitourinarios(String sintomasGenitourinarios) {
		this.sintomasGenitourinarios = sintomasGenitourinarios;
	}

	public String getSintomasHematicoLinfatico() {
		return sintomasHematicoLinfatico;
	}

	public void setSintomasHematicoLinfatico(String sintomasHematicoLinfatico) {
		this.sintomasHematicoLinfatico = sintomasHematicoLinfatico;
	}

	public String getSintomasEndocrinos() {
		return sintomasEndocrinos;
	}

	public void setSintomasEndocrinos(String sintomasEndocrinos) {
		this.sintomasEndocrinos = sintomasEndocrinos;
	}

	public String getSintomasSistemaNervioso() {
		return sintomasSistemaNervioso;
	}

	public void setSintomasSistemaNervioso(String sintomasSistemaNervioso) {
		this.sintomasSistemaNervioso = sintomasSistemaNervioso;
	}

	public String getSintomasMusculoEsqueleticos() {
		return sintomasMusculoEsqueleticos;
	}

	public void setSintomasMusculoEsqueleticos(String sintomasMusculoEsqueleticos) {
		this.sintomasMusculoEsqueleticos = sintomasMusculoEsqueleticos;
	}

	public String getSintomasPielMucosasAnexos() {
		return sintomasPielMucosasAnexos;
	}

	public void setSintomasPielMucosasAnexos(String sintomasPielMucosasAnexos) {
		this.sintomasPielMucosasAnexos = sintomasPielMucosasAnexos;
	}

	public String getTensionArterial() {
		return tensionArterial;
	}

	public void setTensionArterial(String tensionArterial) {
		this.tensionArterial = tensionArterial;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}

	public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}

	public String getFrecuenciaRespiratoria() {
		return frecuenciaRespiratoria;
	}

	public void setFrecuenciaRespiratoria(String frecuenciaRespiratoria) {
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getGlucosa() {
		return glucosa;
	}

	public void setGlucosa(String glucosa) {
		this.glucosa = glucosa;
	}

	public String getExploracionFisica() {
		return exploracionFisica;
	}

	public void setExploracionFisica(String exploracionFisica) {
		this.exploracionFisica = exploracionFisica;
	}

	public String getResultadosAntActLaboratorio() {
		return resultadosAntActLaboratorio;
	}

	public void setResultadosAntActLaboratorio(String resultadosAntActLaboratorio) {
		this.resultadosAntActLaboratorio = resultadosAntActLaboratorio;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getFarmacologico() {
		return farmacologico;
	}

	public void setFarmacologico(String farmacologico) {
		this.farmacologico = farmacologico;
	}

	public String getPronostico() {
		return pronostico;
	}

	public void setPronostico(String pronostico) {
		this.pronostico = pronostico;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
