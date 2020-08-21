package org.serratec.projeto3.projeto3.Exception;

public class TodoNotFoundException extends Exception{
    private static final long  serialVersionUID = -794809328L;
    private Integer id;

    public TodoNotFoundException(Integer id) {
        this.id = id;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	} 
    
}