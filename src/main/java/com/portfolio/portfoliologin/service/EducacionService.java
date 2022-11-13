
package com.portfolio.portfoliologin.service;

import com.portfolio.portfoliologin.model.Educacion;
import com.portfolio.portfoliologin.repo.IEducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService  implements IEducacionService{
    
    @Autowired
    private IEducacionRepo educacionRepo;
    
    @Override
    public void saveEducacion(Educacion educacion) {
    educacionRepo.save(educacion);
    }

    @Override
    public List<Educacion> getEducacion() {
     
    return educacionRepo.findAll();
    }

    @Override
    public Educacion getEducacionById(Long id_educacion) {
    return educacionRepo.findById(id_educacion).orElse(null);
    }

    @Override
    public void deleteEducacionById(Long id_educacion) {
    educacionRepo.deleteById(id_educacion);
    }

    @Override
    public void updateEducacionByCode(Long id_educacion, String nuevo_nombre, String nueva_descripcion) {
      Educacion educacion = this.getEducacionById(id_educacion);
        
        
        educacion.setNombre(nuevo_nombre);
        educacion.setDescripcion(nueva_descripcion);
        
        
        
        this.saveEducacion(educacion);
    
    }

    @Override
    public void updateEducacion(Educacion educacion) {
    this.saveEducacion(educacion);
    }
}
