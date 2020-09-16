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
    // Metodo de salvar extendido do JPA
    FactorialRepository factorialRepository;

    @Override
    // Metodo de salvar extendido do JPA
    public List<Calcs> findAll(){
        return factorialRepository.findAll();
    }

    @Override
    // Metodo de salvar extendido do JPA
    public Calcs save(Calcs calc){
        return factorialRepository.save(calc);
    }

    @Override
    // Calculo do fatorial eh feito
    public Long calculate(Long number){
        for(Long i = number-1; i > 0; i--){
            number *= i;
        }
        return number;
    }

    @Override
    // Procura no banco se ja existe algum calculo feito para x numero
    public Calcs findByNumber(Long number){
        List<Calcs> allCalcs = findAll();
        for(Calcs calc: allCalcs){
            if(calc.getNumber() == number){
                return calc;
            }
        }
        return null;
    }

}
