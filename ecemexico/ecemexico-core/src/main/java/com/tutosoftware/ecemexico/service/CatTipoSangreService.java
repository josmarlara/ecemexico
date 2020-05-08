package com.tutosoftware.ecemexico.service;

import java.util.List;

import com.tutosoftware.ecemexico.entity.CatTipoSangre;

public interface CatTipoSangreService {
	
	public List<CatTipoSangre> obtenerTipoSangre();
	public CatTipoSangre obtenerTipoSangre(int id);

}
