import bancario.Banco;
import bancario.Conta;
import sistem.Menu;
import sistem.ValidarEntradas;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Conta contaLogada = null;

        while (true) {

            if (contaLogada != null) {
                Menu.exibirMenuConta(contaLogada.getTitular().getNome());
                int opcao = ValidarEntradas.retornarInt("Digite a operação que deseja realizar: ");

                if (opcao == 1) {

                    float valor = ValidarEntradas.retornarFloat("Digite o valor que deseja sacar: ");
                    try {
                        contaLogada.sacarDinheiro(valor);
                    } catch (RuntimeException error) {
                        System.err.println(error);
                    }

                } else if (opcao == 2) {

                    float valor = ValidarEntradas.retornarFloat("Digite o valor que você deseja depositar: ");
                    contaLogada.depositarDinheiro(valor);

                } else if (opcao == 3) {

                    int numeroContaRecebedor = ValidarEntradas.retornarInt("Digite o número da conta do recebedor: ");
                    int numeroAgenciaRecebedor = ValidarEntradas.retornarInt("Digite o número da agência do recebedor: ");

                    float valor = ValidarEntradas.retornarFloat("Digite o valor da transferência: ");
                    Conta contaRecebedor = banco.buscarConta(numeroContaRecebedor, numeroAgenciaRecebedor);
                    try {
                        contaLogada.transferenciaDinheiro(contaRecebedor, valor);
                    } catch (RuntimeException error) {
                        System.err.println(error);
                    }

                } else if (opcao == 4) {

                    System.out.println("SEU SALDO É: " + contaLogada.getSaldoConta());

                } else {

                    contaLogada = null;

                }

            } else {
                Menu.exibirMenuInicial();
                int opcao = ValidarEntradas.retornarInt("Digite a opção que você deseja: ");

                if (opcao == 1) {
                    int numeroConta = ValidarEntradas.retornarInt("Digite o número da sua conta: ");
                    int numeroAgencia = ValidarEntradas.retornarInt("Digite o número da sua agência: ");

                    contaLogada = banco.buscarConta(numeroConta, numeroAgencia);
                    if (contaLogada == null) {
                        System.err.println("CONTA NÃO ENCONTRADA!");
                    }
                } else if (opcao == 2) {
                    String nome = ValidarEntradas.retornarString("Digite o seu nome: ");
                    int idade = ValidarEntradas.retornarInt("Digite sua idade: ");
                    String sexo = ValidarEntradas.retornarString("Digite seu sexo: ");
                    String cpf = ValidarEntradas.retornarString("Digite seu CPF: ");
                    String rg = ValidarEntradas.retornarString("Digite seu RG: ");

                    banco.criarConta(nome, idade, sexo, cpf, rg);
                } else {
                    break;
                }
            }
        }
    }
}