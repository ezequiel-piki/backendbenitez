package com.portfolio.portfoliologin.service;

import com.portfolio.portfoliologin.model.Proyecto;
import com.portfolio.portfoliologin.repo.IProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    private IProyectoRepo proyectoRepo;
    
    @Override
    public void saveProyecto(Proyecto proyecto) {
    proyectoRepo.save(proyecto);
    }

    @Override
    public List<Proyecto> getProyectos() {
     
    return proyectoRepo.findAll();
    }

    @Override
    public Proyecto getProyectoById(Long id_proyecto) {
    return proyectoRepo.findById(id_proyecto).orElse(null);
    }

    @Override
    public void deleteProyectoById(Long id_proyecto) {
    proyectoRepo.deleteById(id_proyecto);
    }

    

    @Override
    public void updateProyecto(Proyecto proyecto) {
    this.saveProyecto(proyecto);
    }
}
