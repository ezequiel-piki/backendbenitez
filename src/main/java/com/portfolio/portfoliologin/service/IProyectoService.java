
package com.portfolio.portfoliologin.service;

import com.portfolio.portfoliologin.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    

//Creación: localhost:8181/proyectos/crear
public void saveProyecto(Proyecto proyecto);
    
//Lista completa de skills: localhost:8181/proyectos/traer
 public List<Proyecto> getProyectos(); 
    
//Traer una skill en particular: localhost:8181/proyectos/{id_proyecto}
public Proyecto getProyectoById(Long id_proyecto);
    
//Eliminación: localhost:8181/proyectos/eliminar/{id_proyecto}
 public void deleteProyectoById(Long id_proyecto);    
    
 
 //Edición: localhost:8181/proyectos/editar
  public void updateProyecto(Proyecto proyecto);
}
