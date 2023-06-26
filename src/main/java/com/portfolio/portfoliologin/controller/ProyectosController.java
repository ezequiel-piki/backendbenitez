
package com.portfolio.portfoliologin.controller;

import com.portfolio.portfoliologin.model.Proyecto;
import com.portfolio.portfoliologin.service.IProyectoService;
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
@RequestMapping("/proyectos")
@CrossOrigin(origins = "https://frontendbenitez.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosController {
     @Autowired
    IProyectoService proyectoService;

    //Creación: localhost:8181/proyectos/crear
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear") 
    public void saveProyecto(@RequestBody Proyecto proyecto){
         
        proyectoService.saveProyecto(proyecto);
      
    }
    
    //Lista completa de proyecto: localhost:8181/proyecto/lista
    @GetMapping("/lista")
    public List<Proyecto> getProyectos(){
    return proyectoService.getProyectos();
    }
    
    //Traer una proyecto en particular: localhost:8181/proyecto/{id_proyecto}
    @GetMapping("/{id_proyecto}")
    public Proyecto getProyectoById(@PathVariable Long id_proyecto){
    return proyectoService.getProyectoById(id_proyecto);
    }
    
    //Eliminación: localhost:8181/proyecto/eliminar/{id_proyecto}
    @DeleteMapping("/eliminar/{id_proyecto}")
   // @PreAuthorize("hasRole('ADMIN')")
    public void deleteProyectoById(@PathVariable Long id_proyecto){
    proyectoService.deleteProyectoById(id_proyecto);
    }
    
  
    
      //Edición2: localhost:8181/proyecto/editar
      @PutMapping("/editar/{id_proyecto}")
      @PreAuthorize("hasRole('ADMIN')")
      public Proyecto updateProyecto(@RequestBody Proyecto proyecto, @PathVariable Long id_proyecto){
    
        proyectoService.updateProyecto(proyecto);
    
        return proyectoService.getProyectoById(proyecto.getId());
    }
    
}
