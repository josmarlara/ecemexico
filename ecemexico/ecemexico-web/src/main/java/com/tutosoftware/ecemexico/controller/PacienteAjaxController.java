package com.tutosoftware.ecemexico.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.tutosoftware.ecemexico.entity.Paciente;
import com.tutosoftware.ecemexico.model.NombreCompleto;
import com.tutosoftware.ecemexico.service.PacienteService;

@RestController
public class PacienteAjaxController {
	
	
	@Autowired
	PacienteService pacienteService;
	
	
    @RequestMapping(value = "/buscarExpedienteId/{idUsuario}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Paciente buscarExpedienteId(@PathVariable String idUsuario) {
		
    	
    	
		Paciente paciente = new Paciente();
		
		//AjaxPacienteResponse ajaxPacienteResponse = new AjaxPacienteResponse();
		
		if(idUsuario.equals("")) {
			System.out.println("El id usuario es nulo");
			return null;
		}
	
		System.out.println("El id usuario es:"+idUsuario);
		paciente = pacienteService.buscarExpedientePorIdPaciente(idUsuario);
		
		System.out.println(paciente.getNombre());
		
		//ajaxPacienteResponse.setPaciente(paciente);
		
		
		
		return paciente;
	}
    
    @RequestMapping(value = "/buscarExpedienteCurp/{curp}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Paciente> buscarExpedienteCurp(@PathVariable String curp){
    	
    	List<Paciente> pacientes = new ArrayList<Paciente>();
    	
    	if(curp.equals("")) {
			System.out.println("El curp es nulo");
			return null;
		}
    	
    	pacientes = pacienteService.buscarExpedientePorCurp(curp);
    	
    	return pacientes;
    }
    
    @RequestMapping(value = "/buscarExpedienteNombre",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Paciente> buscarExpedienteNombre(@RequestBody NombreCompleto nc){
    	
    	List<Paciente> pacientes = new ArrayList<Paciente>();
    	pacientes = pacienteService.buscarExpedientePorNombre(nc);
    	return pacientes;
    }
    


}
