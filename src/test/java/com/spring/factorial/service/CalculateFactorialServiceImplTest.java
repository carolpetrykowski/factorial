package com.spring.factorial.service;

import com.spring.factorial.model.Calcs;
import com.spring.factorial.service.serviceImpl.FactorialServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class CalculateFactorialServiceImplTest {

    @Autowired
    private FactorialServiceImpl serviceImpl;

    @Test
    public void calculateFactorial(){
        long factorialZero = serviceImpl.calculate(0l);
        long factorialOne = serviceImpl.calculate(1l);
        long factorialTwo = serviceImpl.calculate(2l);
        long factorialThree = serviceImpl.calculate(3l);
        long factorialFour = serviceImpl.calculate(4l);
        long factorialFive = serviceImpl.calculate(5l);

        assertEquals(0l, factorialZero);
        assertEquals(1l, factorialOne);
        assertEquals(2l, factorialTwo);
        assertEquals(6l, factorialThree);
        assertEquals(24l, factorialFour);
        assertEquals(120l, factorialFive);
    }

    @Test
    public void findFactorialByNumber(){
        Calcs calc = new Calcs();
        calc.setNumber(100l);
        calc.setResult(8000l);
        serviceImpl.save(calc);

        calc = serviceImpl.findByNumber(3l);

        assertNotNull(calc);
    }

}
