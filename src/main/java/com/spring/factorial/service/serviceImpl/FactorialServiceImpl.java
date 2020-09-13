package com.spring.factorial.service.serviceImpl;

import com.spring.factorial.model.Calcs;
import com.spring.factorial.repository.FactorialRepository;
import com.spring.factorial.service.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactorialServiceImpl implements FactorialService {

    @Autowired
    FactorialRepository factorialRepository;

    @Override
    public List<Calcs> findAll(){
        return factorialRepository.findAll();
    }

    @Override
    public Calcs findById(Integer id){
        return factorialRepository.findById(id).get();
    }

    @Override
    public Calcs save(Calcs calc){
        return factorialRepository.save(calc);
    }


}
