package org.serratec.projeto_aluno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class calculadora_maisculo{
    @RequestMapping("/ola")
    public String olaMundo(){
        return "Olá mundo";
    }

    @RequestMapping("/maiuscula")
    public String maiuscula(@RequestParam String valor){
        return valor.toUpperCase();
    }

    @RequestMapping("/somar")
    public Double somar(@RequestParam Double valor1, Double valor2){
        return valor1 + valor2;
    }

    @RequestMapping("/subtrair")
    public Double subtrair(@RequestParam Double valor1, Double valor2){
        return valor1 - valor2;
    }

    @RequestMapping("/dividir")
    public Double dividir(@RequestParam Double valor1, Double valor2){
        return valor1 / valor2;
    }

    @RequestMapping("/multiplicar")
    public Double multiplicar(@RequestParam Double valor1, Double valor2){
        return valor1 * valor2;
    }
}