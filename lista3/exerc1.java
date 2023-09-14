import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numInt = scanner.nextInt();
        int numReal = scanner.nextInt();
        scanner.close();
        if (numInt < numReal) {
            System.out.println("O número inteiro é menor do que o número real.");
        } else {
            return;
        }
    }
}
