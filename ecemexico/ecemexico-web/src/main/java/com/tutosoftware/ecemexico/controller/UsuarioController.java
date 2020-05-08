package com.tutosoftware.ecemexico.controller;



import java.security.Principal;

import java.util.Locale;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tutosoftware.ecemexico.entity.Usuario;
import com.tutosoftware.ecemexico.service.UsuarioService;




@Controller
public class UsuarioController {
	
	
	@Autowired
	UsuarioService usuarioService;
	
	 @Autowired
	 private PasswordEncoder passwordEncoder;
	
	
	@RequestMapping(value = {"/","/home"}, method=RequestMethod.GET)
	public ModelAndView obtenerIndex(Model model,Principal principal){
		
		
		
			ModelAndView modelo = new ModelAndView("login");
			
			
			return modelo;
	
		
		
	}
	
	
	@RequestMapping(value = "/accesoDenegado", method = RequestMethod.GET)
	public String accessDeniedPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());
		return "accessoDenegado";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		
		return "login";
	}
	
	
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menuPage(ModelMap model) {
		
		model.addAttribute("user", getPrincipal());
		return "menu";
	}
	
	
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}
	
	
	
	
	
	private String getPrincipal(){
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails)principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}
	
	
	@RequestMapping(value = "/registrarUsuarioForm", method=RequestMethod.GET)
	public ModelAndView mostrarFormularioUsuario(Locale locale,Model model){
		
		   Usuario usuario = new Usuario();
		    
			ModelAndView modelo = new ModelAndView("agregarUsuario");
			
			
			model.addAttribute("usuario",usuario);
			
			
			return modelo;
	
		
		
	}
	
	@RequestMapping(value = "/guardarUsuario", method=RequestMethod.POST)
	public ModelAndView crearUsuario(@ModelAttribute("usuario")  Usuario usuario,Model model){
		ModelAndView modelo = new ModelAndView("verUsuarios");
		
		
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		
		usuarioService.guardarUsuario(usuario);
		
		Usuario usuarioObj = usuarioService.obtenerUsuario(usuario.getEmail());
		
		modelo.addObject("usuario",usuarioObj);
		
		return modelo;
		
	}
	
	
	@RequestMapping("/buscarUsuarioForm")
    public ModelAndView buscarFormUsuario(Locale locale,Model model) {  
	 
        return new ModelAndView("verUsuarios");    	
    }
	
	
	 @RequestMapping("/buscarUsuario")
	    public ModelAndView buscarUsuario(@RequestParam("email") String email) {  
		 Usuario usuario = usuarioService.obtenerUsuario(email);
	        return new ModelAndView("verUsuarios", "usuario",usuario);    	
	    }
	
	 @RequestMapping("/actualizarUsuarioForm")
	    public ModelAndView actualizarUsuario(@RequestParam("email") String email,Model model) {  
		 Usuario usuario = usuarioService.obtenerUsuario(email);
		 Usuario usuarioObj = new Usuario();
		     model.addAttribute("usuarioObj",usuarioObj);
	        return new ModelAndView("modificarUsuario", "usuario",usuario);    	
	    }
	
	 @RequestMapping(value = "/actualizarUsuario", method=RequestMethod.POST)
		public ModelAndView updateUsuario(@ModelAttribute("usuarioObj")  Usuario usuario,Model model){
			ModelAndView modelo = new ModelAndView("verUsuarios");
			Usuario usuarioObj = new Usuario();
			
			 Usuario usuario2 = usuarioService.obtenerUsuario(usuario.getEmail());
			 
			 if(usuario2.getPassword().equals(usuario.getPassword())) {
				  usuarioObj= usuarioService.updateUsuario(usuario);
			 }else {
				 usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
				 usuarioObj = usuarioService.updateUsuario(usuario);
			 }
			 
			
           
           
           
           modelo.addObject("usuario",usuarioObj);
           
           return modelo;
	 }
	 
	 
	 @RequestMapping("/eliminarUsuario")
	    public ModelAndView eliminarUsuario(@RequestParam("email") String email,Model model) {  
		 usuarioService.deleteUsuario(email);
		 
	        return new ModelAndView("verUsuarios");    	
	    }
           
}
