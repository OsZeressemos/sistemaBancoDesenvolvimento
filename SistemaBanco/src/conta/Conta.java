package conta;

import sistemExceptions.DepositoIndevido;
import javax.swing.JOptionPane;

/* Saque ok.
 * Deposito,ok
 * Transferencia,ok 
 * ConsultaSaldo ok*/

public class Conta {

	public int numero;
	public int agencia;
	public String titular;
	public int cpf; // tipo errado...char(11)
	public int senha;
	public double saldo;
	public int tipo;
	
	
	public Conta(){
		
	}
	
	public Conta(int cpf, int numero, int agencia, double saldo, int tipo){
		this.cpf = cpf;
		this.numero=numero;
		this.agencia=agencia;
		this.saldo=saldo;
		this.tipo=tipo;
		
	}
	
	public boolean saque(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		} else {
			this.saldo -= valor + 0.10;
					System.out.println("Saque realizado!");
			return true;
		}
	
	}

	public void deposito(double valor) {
		if (valor > 0.1) {
			this.saldo += valor - 0.10;
		} else {
			throw new DepositoIndevido("Valor mínimo para depósito: R$ 10,00");
		}
	}

	public boolean transfer(Conta destino, double valor) {
		if (this.saldo >= valor) { //As contas serão incluídas com BD.
			destino.saldo=destino.saldo+valor;
			this.saldo -= valor + 0.20;
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}

	}
	
	public void consultaSaldo() {
        System.out.printf("Seu saldo é: "+"R$ %.2f%n"+this.saldo);
    }
	
	// Getters and setters;
	
	public double getSaldo() {
        return this.saldo;
    }

    public int getCpfTitular() {
        return cpf;
    }

    public void setCpfTitular(int cpf) {
        this.cpf = cpf; // verificar sobre atualização de cadastro.
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Conta [titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", tipo=" + tipo
                + ", cpfTitular=" + cpf + ", saldo=" + saldo + "]";
    }

}
