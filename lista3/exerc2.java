import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        if (num1 == num2) {
            System.out.println("são iguais");
        } else {
            return;
        }

    }
}
