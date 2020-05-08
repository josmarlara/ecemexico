package com.tutosoftware.ecemexico.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tutosoftware.ecemexico.entity.NotasEvolucion;
import com.tutosoftware.ecemexico.service.NotasEvolucionService;

@Controller
public class NotasEvolucionController {
	
	@Autowired
	NotasEvolucionService notasEvolucionService;
	
	@RequestMapping(value = "/mostrarNotasEvolucion", method=RequestMethod.GET)
	public ModelAndView actualizarExpediente(@RequestParam String idPaciente,ModelMap model){
		ModelAndView modelo = new ModelAndView("mostrarNotasGeneral");
	   List<NotasEvolucion> listNotas = notasEvolucionService.buscarNotasPorIdPaciente(idPaciente);
		modelo.addObject("listNotas",listNotas);
		modelo.addObject("idPaciente",idPaciente);
		
		
		return modelo;
	}
	
	@RequestMapping(value = "/mostrarFormNotas", method=RequestMethod.GET)
	public ModelAndView mostrarFormularioHistoria(@RequestParam String idPaciente,ModelMap model){
		ModelAndView modelo = new ModelAndView("guardarNotasEvolucion");
			NotasEvolucion nota = new NotasEvolucion();
			modelo.addObject("idPaciente",idPaciente);
			
			model.addAttribute("nota",nota);
		
		
		return modelo;
	}
	
	
	@RequestMapping(value = "/agregarNotaEvolucion", method=RequestMethod.POST)
	public ModelAndView guardarHistoria(@ModelAttribute("nota")NotasEvolucion nota,Model model) {
		ModelAndView modelo = new ModelAndView("mostrarNotasGeneral");
		LocalDateTime ahora = LocalDateTime.now();
		nota.setFecha(ahora);
		notasEvolucionService.guardarNotasEvolucion(nota);
		
		List<NotasEvolucion> listNotas = notasEvolucionService.buscarNotasPorIdPaciente(nota.getIdPaciente());
		modelo.addObject("listNotas",listNotas);
		modelo.addObject("idPaciente",nota.getIdPaciente());
		
		
		return modelo;
	}
	
	
	@RequestMapping(value = "/mostrarNotaEvolucionFecha", method=RequestMethod.GET)
	public ModelAndView mostrarHistoriaFecha(@RequestParam String idPaciente,@RequestParam("fecha")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	LocalDateTime fecha,ModelMap model){
		ModelAndView modelo = new ModelAndView("mostrarNotaEvolucionFecha");
			NotasEvolucion nota = notasEvolucionService.buscarNotaPorIdPacienteFecha(idPaciente, fecha); 
		modelo.addObject("nota",nota);
		return modelo;
	}

}
