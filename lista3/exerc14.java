import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float media = 0;
        int nota8 = 0;
        int nota0 = 0;
        float notaat = 0;

        for (int i = 0; i < 10; i++) {
            notaat = scanner.nextFloat();
            if (notaat > 8) {
                nota8++;
            }
            if (notaat == 0) {
                nota0++;
            }
            media += notaat;
        }
        scanner.close();

        media = media / 10;

        if (media >= 6) {
            System.out.println("notas maior que 8: "+nota8);
        } else {
            System.out.println("notas 0: "+nota0);
        }

    }
}
