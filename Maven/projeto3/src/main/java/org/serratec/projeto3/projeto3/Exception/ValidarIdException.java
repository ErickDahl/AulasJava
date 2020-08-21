package org.serratec.projeto3.projeto3.Exception;

public class ValidarIdException extends Exception {

    private static final long serialVersionUID = 1L;
    private Integer id;

    public ValidarIdException(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    } 
}