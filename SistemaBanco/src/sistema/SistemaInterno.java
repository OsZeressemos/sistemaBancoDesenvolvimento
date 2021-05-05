package sistema;
import conta.Conta;
import java.util.Scanner;

public class SistemaInterno{

	public static void main(String[] args){
		Conta op = new Conta();
		Scanner read = new Scanner(System.in);
		int operation = 0;	
		
		//menu de clientes
	
		System.out.println("Bem vindo ao Zeressemos International Bank! \n\nDigite:");
		System.out.println("1 - Consultar saldo");
		System.out.println("2 - Depositar");
		System.out.println("3 - Sacar");
		System.out.println("4 - Transferir");
		System.out.println("5 - Extrato");
		System.out.println("6 - Atualizar dados");
		System.out.println("7 - sair");
		System.out.print("\nEscolha uma opção: ");
		operation = read.nextInt();
			
		switch(operation){
		
		case 1:
			System.out.println(op.toString());
			break;
		
		case 2:
			System.out.println("Informe o valor para depósito: ");
			int value = read.nextInt();
				op.deposito(value);
				System.out.println(op.toString());
			break;
				
		case 3:
			System.out.println("Informe o valor para saque: ");
			int valor = read.nextInt();
			op.saque(valor);
			System.out.println(op.toString());
		
			break;
			
		case 4:
			op.transfer(op, 0);
			break;
		case 5:
			op.toString(); //Aoperação não será essa. Apenas teste.
			break;
		case 6:
			
			System.out.println("\nEscolha uma opção para atualizar: ");
			System.out.println("\n1 - Nome Titular\t2 - Senha");
			System.out.print("\nEscolha:");
			int escolha = read.nextInt();
			
		switch(escolha){
		
		case 1: 
			
			System.out.print("\nInforme o nome atual: ");
				String nomeAtual = read.next();
					op.setTitular(nomeAtual);
						System.out.println("\nDados Atualizados: \n"+op.toString());
			
			}
			
			op.toString();
			break;
			
			// verificar tratamento de exceção
			default:
				System.out.println("\nAgradecemos a preferência, volte sempre!");
					break;
		}
	}
}
					

