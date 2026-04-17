import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Diga qual o tamanho do lado do quadrado ");        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double lado = scanner.nextDouble();
        double area = (lado * lado);
        System.out.println(" A area  do seu quadrado é " + area);
    }
}