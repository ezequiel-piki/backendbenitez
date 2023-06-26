package com.portfolio.portfoliologin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfoliologin.model.Habilidad;


import com.portfolio.portfoliologin.service.HabilidadService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/habilidad")
@CrossOrigin(origins = "https://frontendbenitez.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadController {
	
	@Autowired
    private HabilidadService habilidadService;
    
     

   //Lista Exp Laboral: localhost:8181/habilidades
   @GetMapping("/habilidades")
   public List<Habilidad> getHabilidad() {
	return	habilidadService.getHabilidad();	
	}
   
   @PostMapping("/habilidades/crear")
   //@PreAuthorize("hasRole('ADMIN')")
   public void createHabilidad(@RequestBody Habilidad habilidad) {
   	habilidadService.saveHabilidad(habilidad);
   }
   
   @DeleteMapping("/habilidades/eliminar/{id}")
   //@PreAuthorize("hasRole('ADMIN')")
   public void deleteHabilidadById(@PathVariable Long id) {
   habilidadService.deletehabilidadById(id);
   
   }

   @GetMapping("/habilidades/{id}")
   public Habilidad findHabilidadById(@PathVariable Long id) {
     return habilidadService.findHabilidadById(id); 	
   }
   
   @PutMapping("/habilidades/edit/{id}")
   //@PreAuthorize("hasRole('ADMIN')")
    public Habilidad updateHabilidadByCode(@PathVariable Long id, 
                                                                   @RequestParam(required = false, name="name")String nuevo_nombre,
                                                                   @RequestParam(required = false, name="descripcion") String nueva_descripcion)
    {
        
        habilidadService.updateHabilidadByCode(id, nuevo_nombre, nueva_descripcion );
       
        Habilidad habilidad = habilidadService.findHabilidadById(id);
        
       return habilidad;
    }
    
    //Edición2: localhost:8181/habilidades/editar
      @PutMapping("/habilidades/editar/{id}")
    public Habilidad updateHabilidad(@RequestBody Habilidad habilidad, @PathVariable Long id){
    
        habilidadService.updateHabilidad(habilidad);
    
        return habilidadService.findHabilidadById(habilidad.getId());
    }
    
}
