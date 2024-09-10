package bancoFatec;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f=new Funcionario("Luciana","999999",5000);
        Gerente g= new Gerente("Pedro","988888",5000,1234,10);
        System.out.println(f);
        System.out.printf("\n Bonificação Funcionário R$ %.2f",f.bonificacao());
        System.out.println(g);
        System.out.printf("\n Bonificação Gerente R$ %.2f",g.bonificacao());
	}

}
