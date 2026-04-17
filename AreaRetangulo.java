import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Diga qual o tamanho do base do seu retângulo:");        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double base = scanner.nextDouble();
        System.out.print(" Agora diga qual a altura do seu retângulo:");
        double altura = scanner.nextDouble();
        double area = (base * altura);
        System.out.println(" A area  do seu retângulo é " + area);
    }
}