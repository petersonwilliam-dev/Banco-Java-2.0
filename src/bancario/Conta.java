package bancario;

import usuarios.Titular;

public class Conta {
    private Titular titular;
    private int numeroConta;
    private int numeroAgencia;
    private float saldoConta;

    public Conta(Titular titular, int numeroConta) {
        this.titular = titular;
        this.saldoConta = 0;
        this.numeroConta = numeroConta;
        this.numeroAgencia = 1;
    }

    public void sacarDinheiro(float valor) {
        if (getSaldoConta() >= valor) {
            this.saldoConta -= valor;
        } else {
            throw new RuntimeException("SALDO INSUFICIENTE!");
        }
    }

    public void depositarDinheiro(float valor) {
        this.saldoConta += valor;
    }

    public void transferenciaDinheiro(Conta conta, float valor) {
        if (valor <= this.saldoConta) {
            this.saldoConta -= valor;
            conta.saldoConta += valor;
        } else {
            throw new RuntimeException("SALDO INSUFICIENTE!");
        }
    }

    public Titular getTitular() {
        return this.titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public int getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public float getSaldoConta() {
        return this.saldoConta;
    }
}
