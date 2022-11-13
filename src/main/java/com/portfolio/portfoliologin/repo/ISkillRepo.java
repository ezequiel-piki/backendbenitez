
package com.portfolio.portfoliologin.repo;

import com.portfolio.portfoliologin.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ISkillRepo extends JpaRepository<Skill, Long> {
    
}
