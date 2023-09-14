import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        if (num1 > num2) {
            System.out.println(num1+" É maior");
        } else if (num2 > num1) {
            System.out.println(num2+" É maior");
        } else {
            System.out.println("são iguais");
        }

    }
}
