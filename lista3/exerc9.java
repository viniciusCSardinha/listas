import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        scanner.close();

        float media = (nota1 + nota2) / 2;

        if (imc >= 9) {
            System.out.println("Parabéns, continue assim!");
        } else if (imc >= 7) {
            System.out.println("Aprovado.");
        } else if (imc >= 6) {
            System.out.println("Aprovado no limite, estude um pouco mais.");
        } else if (imc >= 2) {
            System.out.println("Não está aprovado mas ainda pode fazer a segunda época");
        } else {
            System.out.println("Reprovado. Nos vemos semestre que vem.");
        }

    }
}
