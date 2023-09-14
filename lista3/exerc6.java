import java.util.Scanner;

public class exerc6 {
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float saldo = scanner.nextFloat();
        float saque = scanner.nextFloat();
        scanner.close();
        if (saldo >= saque) {
            System.out.println(saldo-saque);
            //saldo =- saque
        } else {
            System.out.println("não há saldo suficiente");
        }

    }
}
