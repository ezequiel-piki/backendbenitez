/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfoliologin.controller;

import com.portfolio.portfoliologin.model.Persona;
import com.portfolio.portfoliologin.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("/persona")
//@CrossOrigin(origins = "https://frontendbenitez.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
  
     @Autowired
     IPersonaService personaService;
     
     //Creación: localhost:8181/persona/crear
    @PostMapping("/crear")
    public void savePersona(@RequestBody Persona persona){
         
        personaService.savePersona(persona);
      
    }
    
    //Lista completa de clientes: localhost:8181/persona/lista
    @GetMapping("/traer")
    public List <Persona> getPersona(){
        
    return personaService.getPersona();
    }
    
    //Traer un cliente en particular: localhost:8181/persona/{id_persona}
    @GetMapping("/{id_persona}")
    public Persona getpersonaById(@PathVariable Long id_persona){
    return personaService.getPersonaById(id_persona);
    }
    
    //Eliminación: localhost:8181/persona/eliminar/{id_persona}
    @DeleteMapping("/eliminar/{id_persona}")
    public void deletepersonaById(@PathVariable Long id_persona){
    personaService.deletePersonaById(id_persona);
    }
    
    //Edición: localhost:8181/persona/editar/{id_persona}
    @PutMapping("/edit/{id_persona}")
    public Persona updatepersonaByCode(@PathVariable Long id_persona, 
                                                                   @RequestParam(required=false, name="nombre" ) String nuevo_nombre, 
                                                                   @RequestParam(required=false, name="apellido" )  String nuevo_apellido,
                                                                   @RequestParam(required=false, name="descripcion" )  String nueva_descripcion,
                                                                   @RequestParam(required=false, name="img" )  String nueva_imagen
                                                                   ) 
                                                                  {
    
        personaService.updatePersonaByCode(id_persona, nuevo_nombre, nuevo_apellido, nueva_descripcion, nueva_imagen);
        
        Persona persona = personaService.getPersonaById(id_persona);
        
        return persona;
    }
    
      //Edición2: localhost:8181/persona/editar
      @PutMapping("/editar/{id_persona}")
    public Persona updateCliente(@RequestBody Persona persona, @PathVariable Long id_persona){
    
        personaService.updatePersona(persona);
    
        return personaService.getPersonaById(persona.getId());
    }
     
}
