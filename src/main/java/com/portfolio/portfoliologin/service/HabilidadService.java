package com.portfolio.portfoliologin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfoliologin.model.Habilidad;

import com.portfolio.portfoliologin.repo.HabilidadRepo;

@Service
public class HabilidadService implements IHabilidadService{

	@Autowired HabilidadRepo habilidadRepo;
	
	
	@Override
	public List<Habilidad> getHabilidad() {
	 List<Habilidad> habilidad = habilidadRepo.findAll();
	return habilidad;	
	}

	@Override
	public void saveHabilidad(Habilidad habilidad) {
		
		habilidadRepo.save(habilidad);
	}

	@Override
	public void deletehabilidadById(Long id) {
		habilidadRepo.deleteById(id);
		
	}

	@Override
	public Habilidad findHabilidadById(Long id) {
                   return habilidadRepo.findById(id).orElse(null);
		
	}

    @Override
    public void updateHabilidadByCode(Long id, String nuevo_name, String nueva_descripcion) {
         
        //ocupo this porque llamo al mismo metdo findProducto de esta clase   
        Habilidad habilidad = this.findHabilidadById(id);
        
        habilidad.setId(id);
        habilidad.setName(nuevo_name);
        habilidad.setDescripcion(nueva_descripcion);
        
    
        //ocupo this porque ocupo el mismo metodo saveProducto de esta clase para guardar los cambios
        this.saveHabilidad(habilidad);
    }

    @Override
    public void updateHabilidad(Habilidad habilidad) {
    this.saveHabilidad(habilidad);
    }

}
