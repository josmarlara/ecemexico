package com.tutosoftware.ecemexico.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tutosoftware.ecemexico.entity.Receta;
import com.tutosoftware.ecemexico.model.RecetaExp;
import com.tutosoftware.ecemexico.service.RecetaService;

@Controller
public class RecetaController {
	
	@Autowired
	RecetaService recetaService;
	
	@RequestMapping(value = "/mostrarRecetas", method=RequestMethod.GET)
	public ModelAndView actualizarExpediente(@RequestParam String idPaciente,ModelMap model){
		ModelAndView modelo = new ModelAndView("mostrarRecetasGeneral");
	   List<Receta> listRecetas = recetaService.buscarRecetaIdPaciente(idPaciente);
		modelo.addObject("listRecetas",listRecetas);
		modelo.addObject("idPaciente",idPaciente);
		
		
		return modelo;
	}
	
	
	@RequestMapping(value = "/mostrarFormReceta", method=RequestMethod.GET)
	public ModelAndView mostrarFormularioHistoria(@RequestParam String idPaciente,ModelMap model){
		ModelAndView modelo = new ModelAndView("guardarReceta");
			Receta receta = new Receta();
			modelo.addObject("idPaciente",idPaciente);
			
			model.addAttribute("receta",receta);
		
		
		return modelo;
	}
	
	@RequestMapping(value = "/generarReceta", method=RequestMethod.POST)
	public ModelAndView guardarHistoria(@ModelAttribute("receta")RecetaExp receta,Model model) {
		Receta recetaObj = new Receta();
		Set<String> nombreMedicamento = new HashSet<>();
		Set<String> nombreDosis = new HashSet<>();
		Set<String> nombreDuracion = new HashSet<>();
		Set<String> nombreNotas = new HashSet<>();
		String numeroReceta = com.datastax.driver.core.utils.UUIDs.timeBased().toString();
		receta.setNumeroReceta(numeroReceta);
		LocalDateTime ahora = LocalDateTime.now();
		receta.setFecha(ahora);
		List<RecetaExp> listReceta = new ArrayList<RecetaExp>();
		listReceta.add(receta);
		
		recetaObj.setIdPaciente(receta.getIdPaciente());
		recetaObj.setNumeroReceta(numeroReceta);
		recetaObj.setNombreDoctor(receta.getNombreDoctor());
		recetaObj.setFecha(ahora);
		for(int i=0;i<receta.getMedicamento().size();i++){
			
			nombreMedicamento.add(receta.getMedicamento().get(i));
			nombreDosis.add(receta.getDosis().get(i));
			nombreDuracion.add(receta.getDuracion().get(i));
			nombreNotas.add(receta.getNotas().get(i));
		}
		recetaObj.setMedicamento(nombreMedicamento);
		recetaObj.setDosis(nombreDosis);
		recetaObj.setDuracion(nombreDuracion);
		recetaObj.setNotas(nombreNotas);
		recetaService.guardarReceta(recetaObj);
		
		
		
		
		return new ModelAndView("pdfReceta","listReceta",listReceta);
	}
	
	@RequestMapping(value = "/mostrarRecetaNumero", method=RequestMethod.GET)
	public ModelAndView mostrarRectaNUmero(@RequestParam String idPaciente,@RequestParam String numeroReceta,ModelMap model){
		ModelAndView modelo = new ModelAndView("mostrarRecetaNumero");
	  Receta receta = recetaService.buscarRecetaIdPacienteNumeroReceta(idPaciente, numeroReceta); 
	  //System.out.println("El valor de receta:"+receta);
		modelo.addObject("receta",receta);
		return modelo;
	}
	
	

}
