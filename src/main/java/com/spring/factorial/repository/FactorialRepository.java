package com.spring.factorial.repository;

import com.spring.factorial.model.Calcs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactorialRepository extends JpaRepository<Calcs, Integer>{



}
