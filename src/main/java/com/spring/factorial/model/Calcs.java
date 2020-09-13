package com.spring.factorial.model;

import javax.persistence.*;


@Entity
@Table(name="TB_CALCS")
public class Calcs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer number;

    private Integer result;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Integer getNumber(){
        return this.number;
    }

    public void setNumber(Integer number){
        this.number = number;
    }

    public Integer getResult(){
        return this.result;
    }

    public void setResult(Integer result){
        this.result = result;
    }

}
