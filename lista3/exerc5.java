import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        System.out.println(num1 + num2 + num3);
        System.out.println((num1 + num2 + num3) / 3);

        if (num1 > num2) {
            if (num3 > num2) {
                System.out.println(num2);
                if (num1 > num3) {
                    System.out.println(num1);
                } else {
                    System.out.println(num3);
                }
            } else {
                System.out.println(num3);
                if (num2 > num3) {
                    System.out.println(num2);
                } else {
                    System.out.println(num1);
                }
            }
        } else {
            if (num3 > num1) {
                System.out.println(num1);
                if (num2 > num3) {
                    System.out.println(num2);
                } else {
                    System.out.println(num3);
                }
            } else {
                System.out.println(num3);
                if (num1 > num2) {
                    System.out.println(num1);
                } else {
                    System.out.println(num2);
                }
            }
        }

    }
}
