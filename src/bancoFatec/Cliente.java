/**
 * 
 */
package bancoFatec;

/**
 * 
 */
public class Cliente {
	private String nome;
	private String celular;
	public Cliente(String nome, String celular) {
		super();
		this.nome = nome;
		this.celular = celular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", celular=" + celular + "]";
	}

}
