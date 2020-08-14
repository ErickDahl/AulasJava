package Model;

public class Cliente {
	private Integer codigo;
	private String nome;
	private String telefone;
	private String email;

	public Cliente(Integer codigo, String nome, String telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}

	
	/** 
	 * @return Integer
	 */
	public Integer getCodigo() {
		return codigo;
	}

	
	/** 
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	
	/** 
	 * @return String
	 */
	public String getTelefone() {
		return telefone;
	}

	
	/** 
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

}
