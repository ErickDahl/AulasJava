package org.serratec.pedido.exceptions;

public class NotFoundException extends Exception {

	private static final long serialVersionUID = -4335269273248464196L;
	
	private Integer id;
	private String msg;
	
	public NotFoundException(Integer id, String msg) {
		this.id = id;
		this.msg = msg;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
