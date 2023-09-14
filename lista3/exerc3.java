import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        if (num1 > num2) {
            System.out.println("primeiro maior do que o segundo");
        } else { // nota: apesar da frase estar errada, ele pede para falar isso caso seja o
                 // contrario de o primeiro é maior, e o contrario de o primeiro é maior é o
                 // segundo é maior ou igual, não só maior
            System.out.println("segundo maior do que o primeiro");
        }

    }
}
