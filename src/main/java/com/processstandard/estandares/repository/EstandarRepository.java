package com.processstandard.estandares.repository;

import com.processstandard.estandares.model.Estandar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstandarRepository extends JpaRepository<Estandar, Integer> {
    
}
