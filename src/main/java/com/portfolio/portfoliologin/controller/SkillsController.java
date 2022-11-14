package com.portfolio.portfoliologin.controller;

import com.portfolio.portfoliologin.model.Skill;
import com.portfolio.portfoliologin.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
@CrossOrigin(origins = "https://frontendbenitez.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class SkillsController {
   
    @Autowired
    ISkillService skillService;

    //Creación: localhost:8181/skills/crear
    @PostMapping("/crear")
    public void saveSkill(@RequestBody Skill skill){
         
        skillService.saveSkill(skill);
      
    }
    
    //Lista completa de skills: localhost:8181/skills/lista
    @GetMapping("/lista")
    public List<Skill> getSkills(){
    return skillService.getListSkills();
    }
    
    //Traer una skill en particular: localhost:8181/skills/{id_skill}
    @GetMapping("/{id_skill}")
    public Skill getSkillById(@PathVariable Long id_skill){
    return skillService.getSkillById(id_skill);
    }
    
    //Eliminación: localhost:8181/skills/eliminar/{id_skill}
    @DeleteMapping("/eliminar/{id_skill}")
    public void deleteSkillById(@PathVariable Long id_skill){
    skillService.deleteSkillById(id_skill);
    }
    
    //Edición: localhost:8181/skills/editar/{id_skill}
    @PutMapping("/edit/{id_skill}")
    public Skill updateSkillByCode(@PathVariable Long id_skill, 
                                                                   @RequestParam(required=false, name="nombre" ) String nuevo_nombre, 
                                                                   @RequestParam(required=false, name="porcentaje" )   int nuevo_porcentaje) 
                                                                  {
    
        skillService.updateSkillByCode(id_skill, nuevo_nombre, nuevo_porcentaje);
        
        Skill skill = skillService.getSkillById(id_skill);
        
        return skill;
    }
    
      //Edición2: localhost:8181/skills/editar
      @PutMapping("/editar/{id_skill}")
    public Skill updateSkill(@RequestBody Skill skill, @PathVariable Long id_skill){
    
        skillService.updateSkill(skill);
    
        return skillService.getSkillById(skill.getId());
    }
    
 
}
