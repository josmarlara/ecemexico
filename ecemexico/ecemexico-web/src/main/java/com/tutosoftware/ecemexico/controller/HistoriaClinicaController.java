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
import com.tutosoftware.ecemexico.entity.HistoriaClinica;
import com.tutosoftware.ecemexico.service.HistoriaClinicaService;

@Controller
public class HistoriaClinicaController {
	
	
	@Autowired
	HistoriaClinicaService historiaClinicaService;
	
	
	@RequestMapping(value = "/mostrarHistoriaClinica", method=RequestMethod.GET)
	public ModelAndView actualizarExpediente(@RequestParam String idPaciente,ModelMap model){
		ModelAndView modelo = new ModelAndView("mostrarHistoriaGeneral");
			List<HistoriaClinica> listHistorias = historiaClinicaService.buscarHistoriaPorIdPaciente(idPaciente);
		modelo.addObject("listHistorias",listHistorias);
		modelo.addObject("idPaciente",idPaciente);
		
		
		return modelo;
	}
	
	
	@RequestMapping(value = "/mostrarFormHistoria", method=RequestMethod.GET)
	public ModelAndView mostrarFormularioHistoria(@RequestParam String idPaciente,ModelMap model){
		ModelAndView modelo = new ModelAndView("guardarHistoriaClinica");
			HistoriaClinica historia = new HistoriaClinica();
			modelo.addObject("idPaciente",idPaciente);
			
			model.addAttribute("historia",historia);
		
		
		return modelo;
	}
	
	
	@RequestMapping(value = "/agregarHistoriaClinica", method=RequestMethod.POST)
	public ModelAndView guardarHistoria(@ModelAttribute("historia")HistoriaClinica historia,Model model) {
		ModelAndView modelo = new ModelAndView("mostrarHistoriaGeneral");
		LocalDateTime ahora = LocalDateTime.now();
		historia.setFecha(ahora);
		historiaClinicaService.guardarHistoriaClinica(historia);
		
		List<HistoriaClinica> listHistorias = historiaClinicaService.buscarHistoriaPorIdPaciente(historia.getIdPaciente());
		modelo.addObject("listHistorias",listHistorias);
		modelo.addObject("idPaciente",historia.getIdPaciente());
		
		
		return modelo;
	}
	
	
	@RequestMapping(value = "/mostrarHistoriaClinicaFecha", method=RequestMethod.GET)
	public ModelAndView mostrarHistoriaFecha(@RequestParam String idPaciente,@RequestParam("fecha")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	LocalDateTime fecha,ModelMap model){
		ModelAndView modelo = new ModelAndView("mostrarHistoriaClinicaFecha");
			HistoriaClinica historia = historiaClinicaService.buscarHistoriaPorIdPacienteFecha(idPaciente,fecha);
		modelo.addObject("historia",historia);
		return modelo;
	}
	
	

}
