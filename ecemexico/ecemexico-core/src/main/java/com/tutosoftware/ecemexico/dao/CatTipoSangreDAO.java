package com.tutosoftware.ecemexico.dao;

import java.util.List;

import com.tutosoftware.ecemexico.entity.CatTipoSangre;

public interface CatTipoSangreDAO {
	
	
	public List<CatTipoSangre> obtenerTipoSangre();
	public CatTipoSangre obtenerTipoSangre(int id);

}
