package com.portfolio.portfoliologin.service;

import java.util.List;

import com.portfolio.portfoliologin.model.Habilidad;


public interface IHabilidadService {
	                  
                                      //Get list habilidades
		public List <Habilidad> getHabilidad();
		
		//Save object Habilidad
		public void saveHabilidad(Habilidad habilidad);
		
		//Delete object by Id
		public void deletehabilidadById(Double id);
		
		//Find Habilidad by ID
		public Habilidad findHabilidadById(Double id);
		
                                     //editarHabilidad
                                    public void updateHabilidadByCode(Double id, String name, String descripcion);
                                    
                                    //Edición: localhost:8181/habilidades/editar
                                    public void updateHabilidad(Habilidad habilidad);   
		
}
