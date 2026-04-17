//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Idade {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");// praticamente o escreva do visualg
        String nome = scanner.nextLine(); // Ler varíavel
        System.out.println("Agora o ano que nasceu.");
        int idade = scanner.nextInt();
        int ano = 2026;
        System.out.println("Sua idade é");
        System.out.print(ano - idade + " anos.");
        System.out.println(" E seu nome é " + nome + "."); // + = ,

    }
}
