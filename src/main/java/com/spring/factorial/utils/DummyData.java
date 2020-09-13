package com.spring.factorial.utils;

import com.spring.factorial.model.Calcs;
import com.spring.factorial.repository.FactorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    FactorialRepository factorialRepository;

    @PostConstruct
    public void savePosts(){

        List<Calcs> calcList = new ArrayList<>();
        Calcs calc1 = new Calcs();
        calc1.setNumber(5);
        calc1.setResult(120);


        Calcs calc2 = new Calcs();
        calc2.setNumber(4);
        calc2.setResult(24);

        calcList.add(calc1);
        calcList.add(calc2);

        for(Calcs calc: calcList){
            Calcs calcSaved = factorialRepository.save(calc);
            System.out.println(calcSaved.getId());
        }
    }
}