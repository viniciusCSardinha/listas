import java.util.Scanner;

public class exerc13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("erro");
            return;
        }

        if (num1 > num2) {
            if (num3 > num2) {
                if (num1 > num3) {
                    System.out.println(num2 + " " + num3 + " " + num1);
                } else {
                    System.out.println(num2 + " " + num1 + " " + num3);
                }
            } else {
                if (num2 > num3) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                } else {
                    System.out.println(num3 + " " + num2 + " " + num1);
                }
            }
        } else {
            if (num3 > num1) {
                if (num2 > num3) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                } else {
                    System.out.println(num1 + " " + num2 + " " + num3);
                }
            }else{
                if (num2 > num1) {
                    System.out.println(num3 + " " + num1 + " " + num2);
                } else {
                    System.out.println(num1 + " " + num2 + " " + num3);
                }
            }
        }

    }
}
