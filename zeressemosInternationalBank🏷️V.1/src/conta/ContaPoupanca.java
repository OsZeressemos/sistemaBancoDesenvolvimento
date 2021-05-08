package conta;
import javax.swing.JOptionPane;


public class ContaPoupanca extends Conta implements Comparable<Conta>{
	protected int tipo;
	protected final double TAXARENDIMENTO = 0.01575;
	
	public ContaPoupanca() {
		
	}
	public ContaPoupanca(String titular, int cpf, int numero, int agencia, double saldo, int tipo) {
		this.titular = titular;
		this.cpf = cpf;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	public void poupazero() {
		double rendimento;
		
		String entradaDias = JOptionPane.showInputDialog("");
		int numDias = Integer.parseInt(entradaDias);
		
		String entradaValor = JOptionPane.showInputDialog("");
		int valor = Double.parseDouble(entradaValor);
		
		rendimento = (this.TAXARENDIMENTO / 365 * numDias) * valor;
		System.out.println();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println();
	}

	public int getTipo() {
		return tipo;
	}
	
	@Override
	public void consultaTipo() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		if (this.numero > outraConta.numero) {
			return -1;
		} else if (this.numero < outraConta.numero) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public double seguroDeVida(double valor) {
		if(this.saldo >= valor * 0.2) {
			double valorApolice = valor * 0.2;
			this.saldo = this.saldo - valorApolice;
		return valorApolice;
		}else {
			return 0;
		}
	}
}
