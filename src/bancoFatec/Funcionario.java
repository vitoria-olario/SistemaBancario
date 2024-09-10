package bancoFatec;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	// retorna o valor da bonificação
	public double bonificacao() {
		return (0.10*this.salario);
	}
		
	@Override
	public String toString() {
		return "\n Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
}