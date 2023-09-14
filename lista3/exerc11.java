import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int estado = scanner.nextInt();
        float valor = scanner.nextFloat();
        scanner.close();

        if (estado == 2 || estado == 5) {
            System.out.println(valor * 0.88);
        } else if (estado == 1 || estado == 3 || estado == 4) {
            System.out.println(valor * 0.85);
        }
    }
}
