package bancoFatec;

public class Gerente extends Funcionario {
	private int senha;
	private int nFuncionariosGerenciados;
	
	
	public Gerente(String nome, String cpf, double salario, int senha, int nFuncionariosGerenciados) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.nFuncionariosGerenciados = nFuncionariosGerenciados;
	}
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getnFuncionariosGerenciados() {
		return nFuncionariosGerenciados;
	}
	public void setnFuncionariosGerenciados(int nFuncionariosGerenciados) {
		this.nFuncionariosGerenciados = nFuncionariosGerenciados;
	}
	@Override
	public String toString() {
		return super.toString() + "Gerente [nFuncionariosGerenciados=" + nFuncionariosGerenciados + "]";
	}
	
	@Override
	public double bonificacao() {
		// TODO Auto-generated method stub
		return (this.salario * 0.15);
	}
	
	
}
