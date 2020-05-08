package com.tutosoftware.ecemexico.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutosoftware.ecemexico.dao.CatTipoSangreDAO;
import com.tutosoftware.ecemexico.entity.CatTipoSangre;
import com.tutosoftware.ecemexico.util.CassandraUtil;

@Repository
public class CatTipoSangreDAOImpl implements CatTipoSangreDAO {
	
	@Autowired
	CassandraUtil cassandraUtil;

	@Override
	public List<CatTipoSangre> obtenerTipoSangre() {
		// TODO Auto-generated method stub
		String cql = "select * from cat_tipo_sangre";
		List<CatTipoSangre>  catTipoSangre= cassandraUtil.findAll(cql,CatTipoSangre.class);
		return catTipoSangre;
	}
	
	public CatTipoSangre obtenerTipoSangre(int id) {
		CatTipoSangre catTipoSangre = cassandraUtil.findById(id,CatTipoSangre.class);
		return catTipoSangre;
	}

}
