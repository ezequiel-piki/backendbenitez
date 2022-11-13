
package com.portfolio.portfoliologin.service;

import com.portfolio.portfoliologin.model.Educacion;
import java.util.List;


public interface IEducacionService {
      //a. Métodos HTTP: GET, POST, DELETE, PUT
     //b. Endpoints: 

//Creación: localhost:8181/educacion/crear
public void saveEducacion(Educacion educacion);
    
//Lista completa de skills: localhost:8181/educacion
 public List<Educacion> getEducacion(); 
    
//Traer una skill en particular: localhost:8181/skills/{id_educacion}
public Educacion getEducacionById(Long id_educacion);
    
//Eliminación: localhost:8181/educacion/eliminar/{id_educacion}
 public void deleteEducacionById(Long id_educacion);    
    
//Edición: localhost:8181/educacion/editar/{id_educacion}
 public void updateEducacionByCode(Long id_educacion, String nuevo_nombre,   String nueva_descripcion);
 
 //Edición: localhost:8181/educacion/editar
  public void updateEducacion(Educacion educacion);
}
