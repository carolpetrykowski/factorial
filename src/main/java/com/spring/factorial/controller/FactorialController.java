package com.spring.factorial.controller;

import com.spring.factorial.model.Calcs;
import com.spring.factorial.service.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FactorialController {

    @Autowired
    FactorialService factorialService;

    @RequestMapping(value = "/calcs", method = RequestMethod.GET)
    public ModelAndView getPost(){
        ModelAndView mv = new ModelAndView("calcs");
        // Busca todos os calculos
        List<Calcs> calcs = factorialService.findAll();
        // Envia para a view os calculos
        mv.addObject( "calcs", calcs);
        return mv;
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public ModelAndView calculateResult(Long number) {
        ModelAndView mv = new ModelAndView("result");
        Calcs calc;
        // Verifica se algum numero foi digitado
        if(number != null){
            // Recupera do banco se ja existe algum calculo com aquele numero
            calc = factorialService.findByNumber(number);
            if(calc != null){
                // Quando ja existe, apenas envia para a view
                mv.addObject("calc", calc);
                return mv;
            }else{
                // Se nao existe, o calculo do fatorial eh feito
                Long fatorialResult = factorialService.calculate(number);
                if(fatorialResult != null) {
                    calc = new Calcs();
                    calc.setNumber(number);
                    calc.setResult(fatorialResult);
                    // Salva no banco o calculo
                    factorialService.save(calc);
                    // Envia para a view o resultado
                    mv.addObject("calc", calc);
                    return mv;
                }
            }
        }else{
            // Se o usuario nao digitar nenhum valor redireciona para tela inicial
            // Seria bom criar alert aqui para avisar o usuario
            return getPost();
        }
        return null;
    }
}
