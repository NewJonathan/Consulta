package com.programem.consulta;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class incial {

    @GetMapping("")
    public String Inicial(){
        return "Inicial";
      }
    
}