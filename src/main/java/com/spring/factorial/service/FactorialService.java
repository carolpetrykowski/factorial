package com.spring.factorial.service;

import com.spring.factorial.model.Calcs;
import java.util.List;


public interface FactorialService {

    List<Calcs> findAll();
    Calcs save(Calcs calc);
    Long calculate(Long number);
    Calcs findByNumber(Long number);
}
