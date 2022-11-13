package com.portfolio.portfoliologin.service;

import com.portfolio.portfoliologin.model.Skill;
import java.util.List;


public interface ISkillService {
      //a. Métodos HTTP: GET, POST, DELETE, PUT
     //b. Endpoints: 

//Creación: localhost:8181/skills/crear
public void saveSkill(Skill skill);
    
//Lista completa de skills: localhost:8181/skills
 public List<Skill> getListSkills(); 
    
//Traer una skill en particular: localhost:8181/skills/{id_skill}
public Skill getSkillById(Long id_skill);
    
//Eliminación: localhost:8181/skills/eliminar/{id_skill}
 public void deleteSkillById(Long id_skill);    
    
//Edición: localhost:8181/clientes/editar/{id_cliente}
 public void updateSkillByCode(Long id_skill, String nuevo_nombre,  int nuevo_porcentaje);
 
 //Edición: localhost:8181/clientes/editar
  public void updateSkill(Skill skill);
}
