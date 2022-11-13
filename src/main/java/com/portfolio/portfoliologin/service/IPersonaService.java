/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfoliologin.service;

import com.portfolio.portfoliologin.model.Persona;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface IPersonaService {
     //a. Métodos HTTP: GET, POST, DELETE, PUT
     //b. Endpoints: 

//Creación: localhost:8181/persona/crear
public void savePersona(Persona persona);
    
//Lista completa de skills: localhost:8181/persona
 public List<Persona> getPersona(); 
    
//Traer una skill en particular: localhost:8181/skills/{id_persona}
public Persona getPersonaById(Long id_persona);
    
//Eliminación: localhost:8181/persona/eliminar/{id_persona}
 public void deletePersonaById(Long id_persona);    
    
//Edición: localhost:8181/persona/editar/{id_persona}
 public void updatePersonaByCode(Long id_persona, String nuevo_nombre,  String nuevo_apellido, String nueva_descripcion, String nueva_imagen);
 
 //Edición: localhost:8181/persona/editar
  public void updatePersona(Persona persona);
}
