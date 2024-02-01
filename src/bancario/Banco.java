package bancario;

import usuarios.Titular;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<Conta>();
    }

    public void criarConta(String nome, int idade, String sexo, String cpf, String rg) {
        int numeroConta = getContas().size() + 1;

        Titular titular = new Titular(nome, idade, sexo, cpf, rg);
        Conta conta = new Conta(titular, numeroConta);
        adiionarConta(conta);
    }

    public void adiionarConta(Conta conta) {
        List listaContas = getContas();
        listaContas.add(conta);

        this.contas = listaContas;
    }

    public void removeConta(Conta conta) {
        List listaContas = getContas();
        listaContas.remove(conta);

        this.contas = listaContas;
    }

    public Conta buscarConta(int numeroConta, int numeroAgencia) {
        for ( Conta c : getContas()) {
            if (c.getNumeroConta() == numeroConta && c.getNumeroAgencia() == numeroAgencia) {
                return c;
            }
        }
        return null;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
