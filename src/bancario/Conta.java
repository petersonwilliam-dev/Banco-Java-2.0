package bancario;

import usuarios.Titular;

public class Conta {
    private Titular titular;
    private int numeroConta;
    private int numeroAgencia;
    private float saldoConta;

    static int numConta = 0;

    public Conta(Titular titular) {
        this.titular = titular;
        this.saldoConta = 0;
        this.numeroConta = numConta+=1;
    }

    public void consultarDados() {
        System.out.println("================================");
        System.out.println("Titular: " + getTitular().getNome());
        System.out.println("N° conta: " + getNumeroConta());
        System.out.println("N° agência: " + getNumeroAgencia());
        System.out.println("Saldo da conta: " + getSaldoConta());
        System.out.println("================================");
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
