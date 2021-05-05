package usuario;

import conta.Conta;

public class Cliente {

    public Conta conta;
    public int numero;
    public int agencia;

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
}
