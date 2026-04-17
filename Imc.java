import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Agora escreva sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Você pesa " + peso + " kg e mede " + altura + ". De acordo com seu imc que é " + imc + ", você está abaixo do peso.");
        } else if (imc < 24.9) {

                System.out.println("Você pesa " + peso + " kg e mede " + altura + ". De acordo com seu imc que é " + imc + ", você está no peso ideal." );
            } else if (imc < 29.9) {
            System.out.println("Você pesa " + peso + " kg e mede " + altura + ". De acordo com seu imc que é " + imc + ", você está levemente acima do peso.");
                } else  if (imc < 34.9 ) {

                        System.out.println("Você pesa " + peso + " kg e mede " + altura + ". De acordo com seu imc que é " + imc + ", você está em obesidade grau 1");
                    } else if (imc < 39.9)  {

                            System.out.println("Você pesa " + peso + " kg e mede " + altura + ". De acordo com seu imc que é " + imc + ", você está em obesidade grau 2");
                        } else if (imc >= 40.0) {

                                System.out.println("Você pesa " + peso + " kg e mede " + altura + ". De acordo com seu imc que é " + imc + ", você está em obesidade grau 3");
                            }
                        }
                    }





