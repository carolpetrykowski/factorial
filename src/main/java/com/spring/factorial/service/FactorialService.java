package com.spring.factorial.service;

import com.spring.factorial.model.Calcs;
import java.util.List;


public interface FactorialService {

    List<Calcs> findAll();
    Calcs findById(Integer id);
    Calcs save(Calcs calc);

}
