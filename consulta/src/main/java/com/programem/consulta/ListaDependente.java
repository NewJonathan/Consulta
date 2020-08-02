 package com.programem.consulta;

 public class ListaDependente {
    
     String listaDependente(Iterable<Dependente> ListaDependente){
         String html = "";

         for(Dependente d : ListaDependente){
             html = html +
             "<h1>"+d.getNome()+"</h1>"+
             d.getIdade()+"<br>"
             ;
         }
         return html;
     }
 }