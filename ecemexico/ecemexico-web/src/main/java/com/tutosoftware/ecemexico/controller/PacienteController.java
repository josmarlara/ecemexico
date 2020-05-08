package com.tutosoftware.ecemexico.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tutosoftware.ecemexico.entity.Alergia;
import com.tutosoftware.ecemexico.entity.CatTipoSangre;
import com.tutosoftware.ecemexico.entity.Paciente;
import com.tutosoftware.ecemexico.model.Expediente;
import com.tutosoftware.ecemexico.service.CatTipoSangreService;
import com.tutosoftware.ecemexico.service.PacienteService;

@Controller
public class PacienteController {
	
	
	@Autowired
	PacienteService pacienteService;
	
	@Autowired
	CatTipoSangreService catTipoSangreService;
	
	
	
	
	@RequestMapping(value = "/registrarPaciente", method=RequestMethod.GET)
	public ModelAndView mostrarFormularioPaciente(Locale locale,Model model){
		
		   Expediente expediente = new Expediente();
		    
			ModelAndView modelo = new ModelAndView("agregarPaciente");
			Map<Integer, String > tipoSangre = new HashMap<Integer, String>();
			List<CatTipoSangre> catTipoSangre = catTipoSangreService.obtenerTipoSangre();
			for(CatTipoSangre cts : catTipoSangre){
				tipoSangre.put(cts.getIdTipoSangre(),cts.getTipoSangre());
			}
		
			
			model.addAttribute("expediente",expediente);
			
			modelo.addObject("tipoSangreMap",tipoSangre);
			return modelo;
	
		
		
	}
	
	
	@RequestMapping(value = "/guardarPaciente", method=RequestMethod.POST)
	public ModelAndView crearExpediente(@ModelAttribute("expediente") @Valid Expediente expediente,BindingResult result,Model model){
		ModelAndView modelo = new ModelAndView("mostrarPaciente");
		ModelAndView modelo2 = new ModelAndView("agregarPaciente");
		List<String> alergias =expediente.getAlergias();
	    
	    Paciente paciente = new Paciente();
	    CatTipoSangre catTipoSangre2 = new CatTipoSangre();
	   
	    
	    
	    if (result.hasErrors()) {
	    	
	    	List<CatTipoSangre> catTipoSangre = catTipoSangreService.obtenerTipoSangre();
	    	Map<Integer, String > tipoSangre = new HashMap<Integer, String>();
			for(CatTipoSangre cts : catTipoSangre){
				tipoSangre.put(cts.getIdTipoSangre(),cts.getTipoSangre());
			}
			modelo2.addObject("tipoSangreMap",tipoSangre);
	         return modelo2;
	      }
	    
	    
	    
	    String idPaciente = com.datastax.driver.core.utils.UUIDs.timeBased().toString();
	    paciente.setIdUsuario(idPaciente);
	    paciente.setCurp(expediente.getCurp());
	    paciente.setNombre(expediente.getNombre());
	    paciente.setApellidoPaterno(expediente.getApellidoPaterno());
	    paciente.setApellidoMaterno(expediente.getApellidoMaterno());
	    paciente.setNivelSocioeconomico(expediente.getNivelSocioeconomico());
        paciente.setVivienda(expediente.getVivienda());	    
	    paciente.setTipoSangre(expediente.getTipoSangre());
	    paciente.setDiscapacidad(expediente.getDiscapacidad());
	    paciente.setGrupoEtnico(expediente.getGrupoEtnico());
	    paciente.setReligion(expediente.getReligion());
	    paciente.setSexo(expediente.getSexo());
	    paciente.setEdad(expediente.getEdad());
	    paciente.setCalle(expediente.getCalle());
	    paciente.setNumeroExterior(expediente.getNumeroExterior());
	    paciente.setNumeroInterior(expediente.getNumeroInterior());
	    paciente.setEstado(expediente.getEstado());
	    paciente.setMunicipio(expediente.getMunicipio());
	    paciente.setLocalidad(expediente.getLocalidad());
	    paciente.setCodigoPostal(expediente.getCodigoPostal());
	    paciente.setTelefonoFijo(expediente.getTelefonoFijo());
	    paciente.setTelefonoMovil(expediente.getTelefonoMovil());
	    paciente.setColonia(expediente.getColonia());
	    catTipoSangre2 = catTipoSangreService.obtenerTipoSangre(expediente.getTipoSangre());
	    modelo.addObject("catTipoSangreObj",catTipoSangre2); 
	    modelo.addObject("pacienteObj",paciente);
	    
		pacienteService.guardarPaciente(paciente);
		
		Alergia alergiaEx = new Alergia();
		
		Set<String> nombreAlergia = new HashSet<>();
		
		
		if(alergias!=null){
			
			
			for(int i=0;i<alergias.size();i++){
				
				nombreAlergia.add(alergias.get(i).toString());
				
				
				System.out.println(alergias.get(i).toString());
			}
			
			
			alergiaEx.setIdPaciente(idPaciente);
			alergiaEx.setNombres(nombreAlergia);
			
			pacienteService.guardarAlergia(alergiaEx);
			modelo.addObject("alergiaObj",alergiaEx);
		}
		
		
		
		return modelo;
	}
	
	@RequestMapping(value = "/mostrarPaciente", method=RequestMethod.GET)
	public ModelAndView obtenerExpediente(){
		ModelAndView modelo = new ModelAndView("mostrarPaciente");
		
		
		
		
		return modelo;
	}
	
	
	
	@RequestMapping(value = "/exportarExpediente", method=RequestMethod.GET)
	public ModelAndView obtenerPdfExpediente(@RequestParam String idExpediente,@RequestParam String nombre,
			@RequestParam String apellidoPaterno,@RequestParam String apellidoMaterno){
		Paciente pacienteObj = new Paciente();
		pacienteObj.setIdUsuario(idExpediente);
		pacienteObj.setNombre(nombre);
		pacienteObj.setApellidoPaterno(apellidoPaterno);
		pacienteObj.setApellidoMaterno(apellidoMaterno);
		
		List<Paciente> listPaciente = new ArrayList<Paciente>();
		
		listPaciente.add(pacienteObj);
		
		return new ModelAndView("pdfExpediente", "listPaciente",listPaciente);
	}
	
	@RequestMapping(value = "/buscarExpediente", method=RequestMethod.GET)
	public ModelAndView encontrarExpediente(){
		
		
		return new ModelAndView("buscarExpediente");
	}
	
	
	@RequestMapping(value = "/mostrarExpediente", method=RequestMethod.GET)
		public ModelAndView busquedaExpediente(@RequestParam String idUsuario) {
		
		ModelAndView modelo = new ModelAndView("mostrarPaciente");
		Paciente paciente = new Paciente();
		CatTipoSangre catTipoSangre = new CatTipoSangre();
		Alergia alergia = new Alergia();
		paciente = pacienteService.buscarExpedientePorIdPaciente(idUsuario);
		catTipoSangre = catTipoSangreService.obtenerTipoSangre(paciente.getTipoSangre());
		alergia = pacienteService.mostrarAlergia(idUsuario);
		
		modelo.addObject("catTipoSangreObj",catTipoSangre);
		modelo.addObject("pacienteObj",paciente);
		modelo.addObject("alergiaObj",alergia);
		return modelo;
	}
	
	
	@RequestMapping(value = "/modificarDatosPersonales", method=RequestMethod.GET)
	public ModelAndView actualizarExpediente(@RequestParam String idUsuario,ModelMap model){
		ModelAndView modelo = new ModelAndView("modificarExpediente");
		Expediente expediente = new Expediente();
		
		Paciente paciente = new Paciente();
		CatTipoSangre catTipoSangre = new CatTipoSangre();
		Alergia alergia = new Alergia();
		paciente = pacienteService.buscarExpedientePorIdPaciente(idUsuario);
		catTipoSangre = catTipoSangreService.obtenerTipoSangre(paciente.getTipoSangre());
		alergia = pacienteService.mostrarAlergia(idUsuario);
		
		List<CatTipoSangre> catTipoSangre2 = catTipoSangreService.obtenerTipoSangre();
		
		modelo.addObject("listCatTipoSangre",catTipoSangre2);
		modelo.addObject("catTipoSangreObj",catTipoSangre);
		modelo.addObject("pacienteObj",paciente);
		modelo.addObject("alergiaObj",alergia);
		
		model.addAttribute("expediente",expediente);
		
		return modelo;
	}
	
	@RequestMapping(value = "/actualizarPaciente", method=RequestMethod.POST)
	public ModelAndView modificarPaciente(@ModelAttribute("expediente") @Valid Expediente expediente,BindingResult result,Model model) {

		ModelAndView modelo = new ModelAndView("mostrarPaciente");
		ModelAndView modelo2 = new ModelAndView("modificarExpediente");
		List<String> alergias =expediente.getAlergias();
		List<String> alergias2 =expediente.getAlergias2();
	    Paciente paciente = new Paciente();
	    CatTipoSangre catTipoSangre2 = new CatTipoSangre();
	   
	    
	    
	    if (result.hasErrors()) {
	    	/*
	    	List<CatTipoSangre> catTipoSangre = catTipoSangreService.obtenerTipoSangre();
	    	Map<Integer, String > tipoSangre = new HashMap<Integer, String>();
			for(CatTipoSangre cts : catTipoSangre){
				tipoSangre.put(cts.getIdTipoSangre(),cts.getTipoSangre());
			}
			modelo2.addObject("tipoSangreMap",tipoSangre);*/
	         return modelo2;
	      }
		
	    paciente.setIdUsuario(expediente.getIdUsuario());
	    paciente.setCurp(expediente.getCurp());
	    paciente.setNombre(expediente.getNombre());
	    paciente.setApellidoPaterno(expediente.getApellidoPaterno());
	    paciente.setApellidoMaterno(expediente.getApellidoMaterno());
	    paciente.setNivelSocioeconomico(expediente.getNivelSocioeconomico());
        paciente.setVivienda(expediente.getVivienda());	    
	    paciente.setTipoSangre(expediente.getTipoSangre());
	    paciente.setDiscapacidad(expediente.getDiscapacidad());
	    paciente.setGrupoEtnico(expediente.getGrupoEtnico());
	    paciente.setReligion(expediente.getReligion());
	    paciente.setSexo(expediente.getSexo());
	    paciente.setEdad(expediente.getEdad());
	    paciente.setCalle(expediente.getCalle());
	    paciente.setNumeroExterior(expediente.getNumeroExterior());
	    paciente.setNumeroInterior(expediente.getNumeroInterior());
	    paciente.setEstado(expediente.getEstado());
	    paciente.setMunicipio(expediente.getMunicipio());
	    paciente.setLocalidad(expediente.getLocalidad());
	    paciente.setCodigoPostal(expediente.getCodigoPostal());
	    paciente.setTelefonoFijo(expediente.getTelefonoFijo());
	    paciente.setTelefonoMovil(expediente.getTelefonoMovil());
	    paciente.setColonia(expediente.getColonia());
	    catTipoSangre2 = catTipoSangreService.obtenerTipoSangre(expediente.getTipoSangre());
	    modelo.addObject("catTipoSangreObj",catTipoSangre2); 
	    paciente=pacienteService.updatePaciente(paciente);
	    
	    modelo.addObject("pacienteObj",paciente);
	    
	    
	    
	    
           Alergia alergiaEx = new Alergia();
		
		Set<String> nombreAlergia = new HashSet<>();
		
		
		
			
			
			for(int i=0;i<alergias2.size();i++){
				
				nombreAlergia.add(alergias2.get(i).toString());
				
				
				System.out.println(alergias2.get(i).toString());
			}
	    
			
           for(int i=0;i<alergias.size();i++){
				
				nombreAlergia.add(alergias.get(i).toString());
				
				
				System.out.println(alergias.get(i).toString());
			}
           
           alergiaEx.setIdPaciente(expediente.getIdUsuario());
			alergiaEx.setNombres(nombreAlergia);
			
			pacienteService.guardarAlergia(alergiaEx);
			modelo.addObject("alergiaObj",alergiaEx);
           
		
		
		
		return modelo;
	}
	
	
	
	
	
}
