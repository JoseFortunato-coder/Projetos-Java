import java.util.Scanner;

public class IntervaloParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite um segundo número maior que primeiro: ");
        int num2 = scanner.nextInt();
        int menos = num1 - num2;
        while (num2 < num1) {
            System.out.print("Por favor digite um número maior que " + num1 + ": ");
            num2 = scanner.nextInt();
        }
        for (int i = num1; i <= num2; i++) {

            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            }else {
                System.out.println("Ímpar: " + i ) ;
            }


        }
    }
}
