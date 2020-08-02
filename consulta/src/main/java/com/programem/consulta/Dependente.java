package com.programem.consulta;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /** indica que o Banco de Dados deve criar uma tabela para esse objeto */
public class Dependente {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    String nome;

    Integer idade;

   

    public void setId(Integer id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    

    public Integer getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

   

}