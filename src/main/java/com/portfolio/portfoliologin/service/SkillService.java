
package com.portfolio.portfoliologin.service;

import com.portfolio.portfoliologin.model.Skill;
import com.portfolio.portfoliologin.repo.ISkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillService implements  ISkillService{
    @Autowired
    private ISkillRepo skillRepo;

    @Override
    public void saveSkill(Skill skill) {
     skillRepo.save(skill);
    
    }

    @Override
    public List<Skill> getListSkills() {
    return skillRepo.findAll();
    }

    @Override
    public Skill getSkillById(Long id_skill) {
    return skillRepo.findById(id_skill).orElse(null);
    }

    @Override
    public void deleteSkillById(Long id_skill) {
    skillRepo.deleteById(id_skill);
    
    }

    @Override
    public void updateSkillByCode(Long id_skill, String nuevo_nombre, int nuevo_porcentaje) {
      Skill skill = this.getSkillById(id_skill);
        
        
        skill.setNombre(nuevo_nombre);
        skill.setPorcentaje(nuevo_porcentaje);
        
        
        this.saveSkill(skill);
    }

    @Override
    public void updateSkill(Skill skill) {
    this.saveSkill(skill);
    }
    
    
}
