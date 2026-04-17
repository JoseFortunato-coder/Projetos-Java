import java.util.Scanner;

public class DivisãoControlada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número base: ");
        int base = scanner.nextInt();

        int numero;
        int resto;

        while (true) {
            System.out.print("Digite um número maior que o anterior: ");
            numero = scanner.nextInt();

            if (numero < base) {
                System.out.println("Número ignorado.");
                continue;
            }

            resto = numero % base;

            if (resto != 0) {
                System.out.println("Resto: " + resto );
                break;
            }

            System.out.println(numero + " é divisível por " + base + ", não tem resto.");
        }


    }
}