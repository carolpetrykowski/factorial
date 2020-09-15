package com.spring.factorial.model;

import javax.persistence.*;


@Entity
@Table(name="TB_CALCS")
public class Calcs {
    // Atributos de classe
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Long number;

    private Long result;

    // Metodos dos atributos
    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Long getNumber(){
        return this.number;
    }

    public void setNumber(Long number){
        this.number = number;
    }

    public Long getResult(){
        return this.result;
    }

    public void setResult(Long result){
        this.result = result;
    }

}
