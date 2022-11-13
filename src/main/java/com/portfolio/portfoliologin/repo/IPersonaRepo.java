
package com.portfolio.portfoliologin.repo;

import com.portfolio.portfoliologin.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepo extends JpaRepository<Persona, Long> {
    
}
