package com.portfolio.portfoliologin.service;

import com.portfolio.portfoliologin.model.Persona;
import com.portfolio.portfoliologin.repo.IPersonaRepo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepo personaRepo;
    
    @Override
    public void savePersona(Persona persona) {
    personaRepo.save(persona);
    }

    @Override
    public List<Persona> getPersona() {
     
    return personaRepo.findAll();
    }

    @Override
    public Persona getPersonaById(Long id_persona) {
    return personaRepo.findById(id_persona).orElse(null);
    }

    @Override
    public void deletePersonaById(Long id_persona) {
    personaRepo.deleteById(id_persona);
    }

    @Override
    public void updatePersonaByCode(Long id_persona, String nuevo_nombre, String nuevo_apellido, String nueva_descripcion, String nueva_imagen) {
      Persona persona = this.getPersonaById(id_persona);
        
        
        persona.setNombre(nuevo_nombre);
        persona.setApellido(nuevo_apellido);
        persona.setDescripcion(nueva_descripcion);
        persona.setImg(nueva_imagen);
        
        
        this.savePersona(persona);
    
    }

    @Override
    public void updatePersona(Persona persona) {
    this.savePersona(persona);
    }
    
}
