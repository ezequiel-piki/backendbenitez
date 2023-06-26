
package com.portfolio.portfoliologin.controller;

import com.portfolio.portfoliologin.model.Educacion;
import com.portfolio.portfoliologin.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "https://frontendbenitez.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
@Autowired
    IEducacionService  educacionService;

    //Creación: localhost:8181/educacion/crear
    @PostMapping("/crear")
    @PreAuthorize("hasRole('ADMIN')")
    public void saveEducacion(@RequestBody Educacion educacion){
         
        educacionService.saveEducacion(educacion);
      
    }
    
    //Lista completa de clientes: localhost:8181/educacion/lista
    @GetMapping("/lista")
    public List<Educacion> getClientes(){
    return educacionService.getEducacion();
    }
    
    //Traer un cliente en particular: localhost:8181/educacion/{id_educacion}
    @GetMapping("/{id_educacion}")
    public Educacion getEducacionById(@PathVariable Long id_educacion){
    return educacionService.getEducacionById(id_educacion);
    }
    
    //Eliminación: localhost:8181/educacion/eliminar/{id_educacion}
    @DeleteMapping("/eliminar/{id_educacion}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteEducacionById(@PathVariable Long id_educacion){
    educacionService.deleteEducacionById(id_educacion);
    }
    

    
      //Edición2: localhost:8181/educacion/editar
      @PutMapping("/editar/{id_educacion}")
      @PreAuthorize("hasRole('ADMIN')")
    public Educacion updateCliente(@RequestBody Educacion educacion, @PathVariable Long id_educacion){
    
        educacionService.updateEducacion(educacion);
    
        return educacionService.getEducacionById(educacion.getId());
    }
        
}
