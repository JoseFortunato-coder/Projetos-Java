import java.time.LocalDate;
import java.util.Scanner;

public class Difference_Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa:");
        String nome = scanner.nextLine();
        System.out.println("Agora o ano que nasceu a primeira pessoa.");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome da segunda pessoa:");
        String nomee = scanner.nextLine();
        System.out.println("Agora o ano que nasceu a segunda pessoa.");
        int idadee = scanner.nextInt();
        int n = idadee - idade;
        int h = idade - idadee;
        if (idade > idadee) {
            System.out.println(" A diferença de idade entre " + nome + " e " + nomee + " é " + h + " anos ");
        }
        else {
            if (idadee > idade) {
                System.out.println(" A diferença de idade entre " + nome + " e " + nomee + " é " + n + " anos ");
            }
        }
    }
}