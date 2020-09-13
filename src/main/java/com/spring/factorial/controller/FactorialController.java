package com.spring.factorial.controller;

import com.spring.factorial.model.Calcs;
import com.spring.factorial.service.FactorialService;
import org.aspectj.apache.bcel.classfile.AttributeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.engine.AttributeName;

import java.util.List;

@Controller
public class FactorialController {

    @Autowired
    FactorialService factorialService;

    @RequestMapping(value = "/calcs", method = RequestMethod.GET)
    public ModelAndView getPost(){
        ModelAndView mv = new ModelAndView("calcs");
        List<Calcs> calcs = factorialService.findAll();
        mv.addObject( "calcs", calcs);
        return mv;
    }

}
