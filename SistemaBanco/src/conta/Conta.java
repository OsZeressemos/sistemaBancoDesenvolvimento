package conta;

/* Saque ok.
 * Deposito,ok
 * Transferencia,ok
 * AbreConta, 
 * FechaConta, 
 * ConsultaSaldo*/

public class Conta {
	
	public int agencia;
	public int numero;
	public String name;
	public int cpf; //tipo errado...
	public int senha;
	public double saldo;
	
	
	public void saque(double valor) {
		if (this.saldo>=valor) {
				this.saldo-=valor; 
					System.out.println("Saque realizado!");
		}else {
			
			System.out.println("Saldo insuficiente");
		}
		
	}
	
		public void deposito(double valor){
				this.saldo+=valor;	//conferir Void ou return;
		}
	
	
	public void transfer(double destino, double valor) {
			if (this.saldo>=valor){
				 	this.saldo-=valor;
				 		valor+=destino; //conferir
		}else {
			
			System.out.println("Saldo insuficiente");
		}
	
	}
	
	public void abreConta()
	
	

}





