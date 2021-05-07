package conta;
import javax.swing.JOptionPane;
import sistemExceptions.DepositoIndevido;
import taxas.SeguroDeVida;

public abstract class Conta implements SeguroDeVida{
			
			protected String titular;
			protected int numero;
			protected int agencia;
			protected int tipo;
			protected int cpf;
			protected double saldo;
			
			public Conta() {
				
			}

			public Conta(int numero, int agencia, int tipo, int cpf, double saldo) {
				this.numero = numero;
				this.agencia = agencia;
				this.tipo = tipo;
				this.cpf = cpf;
				this.saldo = saldo;
			}
			
			public boolean saque(double valor) {
				if(this.saldo < valor) {
					System.out.println("Saldo Insuficiente!");
					return false;
				} 
				else {
					this.saldo += valor;
					System.out.println("Saque Realizado!");
					return true;
			
				}
			}
			
			public void deposito(double valor) {
				if(valor < 0.1) {
					this.saldo += valor;
				}
				else {
					throw new DepositoIndevido("Valor mínimo para depósito R$ 10");
				}
			}
			
			public boolean transfere(Conta destino, double valor) {
				if (this.saldo >= valor) {
					destino.saldo=destino.saldo+valor;
					this.saldo -= valor;
					return true;
				}
				else {
					System.out.println("Saldo Insuficiente!");
					return false;
				}
			}
			
			public void consultaTipo() {
				
			}

			public void consultaSaldo() {
				System.out.printf("R$ %.2f%n", this.saldo);
			}
			
			public void atualiza(double taxaSelic) {
				this.saldo += this.saldo * taxaSelic;
			}

			public String getTitular() {
				return titular;
			}

			public void setTitular(String titular) {
				this.titular = titular;
			}

			public int getNumero() {
				return numero;
			}

			public void setNumero(int numero) {
				this.numero = numero;
			}

			public int getAgencia() {
				return agencia;
			}

			public void setAgencia(int agencia) {
				this.agencia = agencia;
			}

			public int getTipo() {
				return tipo;
			}

			public void setTipo(int tipo) {
				this.tipo = tipo;
			}

			public int getCpf() {
				return cpf;
			}

			public void setCpf(int cpf) {
				this.cpf = cpf;
			}

			public double getSaldo() {
				return saldo;
			}

			public void setSaldo(double saldo) {
				this.saldo = saldo;
			}

			@Override
			public String toString() {
				return "Conta [titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", tipo=" + tipo
						+ ", cpfTitular=" + cpf + ", saldo=" + saldo + "]";
			}
}