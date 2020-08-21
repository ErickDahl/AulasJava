package org.serratec.trabalho.trabalho_prova.Exeception;

public class ContaNotFoundExeception extends Exception {
    private static final long  serialVersionUID = -794809328L;
    private Integer numero;

	public Integer getId() {
		return numero;
	}

	public void setId(Integer numero) {
		this.numero = numero;
	}

    public ContaNotFoundExeception(Integer numero) {
        this.numero = numero;
    }
    
}