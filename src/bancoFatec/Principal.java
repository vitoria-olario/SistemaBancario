/**
 * 
 */
package bancoFatec;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String menu;
		int op,nconta = 0;
		double valor;
		ArrayList<Conta> lista= new ArrayList<Conta>();
		// Contas
		Conta c = new Conta(new Cliente("Sirley ","119999-99999"),5000);
		Conta outra= new Conta(new Cliente("Victor","119555-5555"),1000);
		lista.add(c);
		lista.add(outra);
		lista.add(new Conta(new Cliente("Verônica", "1177777-7777"), 0));
		lista.add(new Conta(new Cliente("Carlinhos", "1199999-9999"), 0));
		lista.add(new Conta(new Cliente("Rodiney", "1188888-8888"), 0));
		lista.add(new Conta(new Cliente("Sheila", "1166666-6666"), 0));
		lista.add(new Conta(new Cliente("Verônica", "1177777-7777"),0));
		menu = "\n 1.Depositar \n 2.Sacar \n 3.Transferir \n 4.Listar \n 5.Criar nova conta \n 6. Alterar conta \n 0.sair \n Digite a opção desejada:";

		do {
			System.out.println(menu);
			op = entrada.nextInt();
			switch (op) {
			case 1: {
				System.out.println("Insira o valor a ser sacado: ");
				valor = entrada.nextDouble();
				if (c.sacar(valor)){
					System.out.println("Saque Efetuado.");
				}else{
					System.out.println("Erro no Saque.");
				}

				break;
			}
			case 2: {
				System.out.println("Insira o valor do depósito: ");
				valor = entrada.nextDouble();
				if (c.depositar(valor)){
					System.out.println("Depósito Efetuado.");
				}else{
					System.out.println("Depósito não efetuado.");
				}
				break;
			}
			case 3: {

				System.out.println("Digite o número da conta, se não souber, digite -1 para sair, verifique no menu listar e retorne para esta operação");
				nconta= entrada.nextInt();

				if ((nconta<0)||(nconta>lista.size())) break;
				outra= lista.get(nconta-1);
				System.out.println("Digite o valor da transferência");
				valor = entrada.nextDouble();

				if (c.transferir(valor, outra)) {
					System.out.printf("Transferência realizada com sucesso! Seu novo saldo é R$ %.2f. Saldo da outra conta R$ %.2f ", c.getSaldo(),outra.getSaldo() );

				} else {
					System.out.println("Não foi possível realizar a transferência");
				}
				break;
			}
			case 4: {
				for(Conta ct:lista) {
					System.out.println(ct);
				}
				break;
			}
			case 5: {
				String nome, cel;
				System.out.println("Informe seu nome");
				entrada.nextLine();
				nome=entrada.nextLine();
				System.out.println("Informe seu número de Celular");
				cel=entrada.nextLine();        		
				lista.add(new Conta(new Cliente(nome,cel),0));
				break;
			}
			case 6: {
				System.out.println("Digite o número da conta, se não souber, digite -1 para sair, verifique no menu listar e retorne para esta operação");
				nconta= entrada.nextInt();

				if ((nconta<0)||(nconta>lista.size())) break;
				c=lista.get(nconta-1);
				System.out.println(" Conta de acesso: "+ c);

				break;
			}
			case 0: {
				System.out.println("Encerrando o programa");
				break;

			}default:
				System.out.println("Opção inválida!\nRetornando ao menu.\n");	
				break;
			}
		} while(op != 0);
		entrada.close();
	}

}


