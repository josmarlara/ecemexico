package com.tutosoftware.ecemexico.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CassandraUtil {
	
	
	@Autowired
    private CassandraOperations cassandraTemplate;
	
    public <T> void create(T entity) {
        cassandraTemplate.insert(entity);
    }
        
  
   
  
    public <T> void createList(List<T> entities) {
        cassandraTemplate.insert(entities);     
    }
    
   
    public <T> T update(T entity) {     
         cassandraTemplate.update(entity);
         return entity;
    }
    
   
    public <T> void updateList(List<T> entities) {      
        cassandraTemplate.update(entities);
    }
    
    
    
    
   
    public <T> T findById(Object id, Class<T> claz) {
        return cassandraTemplate.selectOneById(id,claz);
    }
    
    
    public <T> void deleteById(Object id, Class<T> claz) {
        cassandraTemplate.deleteById(id,claz);
    }
    
  
    public void delete(Object entity) {
        cassandraTemplate.delete(entity);
    }
    
   
    public <T> void delete(List<T> entities) {
        cassandraTemplate.delete(entities);
    }
    
  
    public <T> T findOne(String cql,Class<T> claz){
    	return cassandraTemplate.selectOne(cql, claz);
    }
    
    
    public <T> List<T> findAll(String cql,Class<T> claz) {
        return (List<T>) cassandraTemplate.select(cql,claz);
    }
    
  
    
    
   
    public <T> void truncate(Class<T> claz) {
        cassandraTemplate.truncate(claz);
    }
    
   
    public <T> long getCount(Class<T> claz) {
        return cassandraTemplate.count(claz);
    }   
 
    
   
    public <T> boolean exists(Object id, Class<T> claz) {
        return cassandraTemplate.exists(id,claz);
    }

}
