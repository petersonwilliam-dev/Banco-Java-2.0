package sistem;

public class Menu {

    public static void exibirMenuInicial() {
        System.out.println("=============== MENU INICIAL ===============");
        System.out.println("1 - Acessar conta");
        System.out.println("2 - Criar conta");
        System.out.println("3 - Sair");
    }

    public static void exibirMenuConta(String nome) {
        System.out.println("=============== BEM VINDO "+nome+" ===============");
        System.out.println("1 - Realizar saque");
        System.out.println("2 - Realizar depósito");
        System.out.println("3 - Realizar transferência para outra conta");
        System.out.println("4 - Consultar saldo");
        System.out.println("5 - Sair");
    }
}
