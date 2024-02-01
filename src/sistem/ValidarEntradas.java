package sistem;
import java.util.Scanner;
public class ValidarEntradas {
    private static final Scanner sc = new Scanner(System.in);

    public static String retornarString(String message) {

        System.out.print(message);
        while (!sc.hasNext()) {
            System.err.println("ESCREVA UM VALOR VÁLIDO!");
            sc.nextLine();
        }
        String string = sc.nextLine();
        return string;
    }

    public static int retornarInt(String message) {

        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.err.println("ESCREVA UM VALOR VÁLIDO!");
            sc.nextLine();
        }
        int number = Integer.parseInt(sc.nextLine());
        return number;
    }

    public static float retornarFloat(String message) {
        System.out.print(message);
        while (!sc.hasNextFloat()) {
            System.err.println("ESCREVA UM VALOR VÁLIDO!");
            sc.nextLine();
        }
        float number = Float.parseFloat(sc.nextLine());
        return number;
    }
}
