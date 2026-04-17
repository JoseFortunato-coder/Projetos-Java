import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        System.out.println("Escreva um número que você quer a tabuada:" );
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i < 11; i++) {

            System.out.println( numero + " x " + i + " = " + (numero * i));

        }

    }
}
