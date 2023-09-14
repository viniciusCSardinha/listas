import java.util.Scanner;
import java.util.*;

public class exerc12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senha = scanner.nextLine();
        scanner.close();
        if (!(senha.charAt(0) == '8' || senha.charAt(0) == '5')) {
            System.out.println("senha invalida");
            return;
        }
        if (!(senha.charAt(3) == '1' || senha.charAt(3) == '5')) {
            System.out.println("senha invalida");
            return;
        } else {
            if (senha.charAt(3) == '5') {
                if (!((Character.getNumericValue(senha.charAt(1)) + Character.getNumericValue(senha.charAt(2))) == 3)) {
                    System.out.println("senha invalida");
                    return;
                }
            } else {
                if (!((Character.getNumericValue(senha.charAt(1)) + Character.getNumericValue(senha.charAt(2))) == 0)) {
                    System.out.println("senha invalida");
                    return;
                }
            }
        }
        System.out.println("senha valida");

    }
}
