package org.serratec.trabalho.trabalho_prova.Exeception;

public class ValidarNumeroException extends Exception {

    private static final long serialVersionUID = 1L;
    private Integer numero;

    public ValidarNumeroException(Integer numero) {
        this.numero = numero;
    }

    public Integer getId() {
        return numero;
    }

    public void setId(Integer numero) {
        this.numero = numero;
    }   
}