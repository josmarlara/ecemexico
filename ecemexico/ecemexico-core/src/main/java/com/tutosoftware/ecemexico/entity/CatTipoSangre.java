package com.tutosoftware.ecemexico.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Table(value="cat_tipo_sangre")
public class CatTipoSangre {
	
	
	@PrimaryKey(value="id_tipo_sangre")
	 int idTipoSangre;
	
	
	@Column(value="tipo_sangre")
	 String tipoSangre;


	public int getIdTipoSangre() {
		return idTipoSangre;
	}


	public void setIdTipoSangre(int idTipoSangre) {
		this.idTipoSangre = idTipoSangre;
	}


	public String getTipoSangre() {
		return tipoSangre;
	}


	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

}
