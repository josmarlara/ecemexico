package com.tutosoftware.ecemexico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutosoftware.ecemexico.dao.CatTipoSangreDAO;
import com.tutosoftware.ecemexico.entity.CatTipoSangre;
import com.tutosoftware.ecemexico.service.CatTipoSangreService;


@Service
@Transactional
public class CatTipoSangreServiceImpl implements CatTipoSangreService {

	@Autowired
	CatTipoSangreDAO  catTipoSangreDAO;
	
	@Override
	public List<CatTipoSangre> obtenerTipoSangre(){
		
		return catTipoSangreDAO.obtenerTipoSangre();
	}
	@Override
	public CatTipoSangre obtenerTipoSangre(int id) {
		return catTipoSangreDAO.obtenerTipoSangre(id);
		
	}

}
