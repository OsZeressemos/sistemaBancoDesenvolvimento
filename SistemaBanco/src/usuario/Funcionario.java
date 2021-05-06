package usuario;

import conta.Conta;

public class Funcionario {

	public String cargo;
	public String nome;
	public int matricula;
	public int cpf;
	public int senha;
	public int agencia;

	public Funcionario(String cargo, String nome, int matricula, int cpf, int senha, int agencia) {

		this.cargo = cargo;
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.senha = senha;
		this.agencia = agencia;

	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public int getCpf() {
		return cpf;
	}
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public class Gerente extends Funcionario {

		Conta conta = new Conta();

		public Gerente(String cargo, String nome, int matricula, int cpf, int senha, int agencia) {
			super(cargo, nome, matricula, cpf, senha, agencia);

			this.cpf = cpf;
			this.senha = senha;

		}

		public boolean validarConta(int cpfCorreto, int senhaCorreta) {

			if (this.conta.cpf == cpfCorreto && this.conta.senha == senhaCorreta) {

				return true;

			} else {

				System.out.println("Login incorreto!");
				return false;

			}
			
		}

		public Conta getConta() {
			
			return conta;

		}
		
		@Override
		public String toString() {
			
			return conta.toString();
			
		}
		
		
		
		

	}

	public class Diretor extends Funcionario {

		Conta conta = new Conta();

		public Diretor(String cargo, String nome, int matricula, int cpf, int senha, int agencia) {
			super(cargo, nome, matricula, cpf, senha, agencia);

			this.cpf = cpf;
			this.senha = senha;
			
		}
			
		public boolean verificarTransacao(int cpfCorreto, int senhaCorreta) {

				if (this.conta.cpf == cpfCorreto && this.conta.senha == senhaCorreta) {

					return true;

				} else {

					System.out.println("Login incorreto!");
					return false;

				}

			}
			

	}

}
/*
 * public class Gerente extends Funcionario { private int senha; private int
 * numeroDeFuncionarios; public boolean autentica(int senha) { if (this.senha ==
 * senha) { System.out.println("Acesso Permitido!"); return true; } else {
 * System.out.println("Acesso Negado!"); return false;
 */
