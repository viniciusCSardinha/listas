import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Misto quente R$5,50\r\n" + //
                "2 - Salada Chinesa R$10,20\r\n" + //
                "3 - Suco de Laranja R$4,00\r\n" + //
                "4 - Suco de Manga R$3,50");

        int opc = scanner.nextInt();
        scanner.close();

        switch (opc) {
            case 1:
                System.out.println("bom apetite, vai lhe custar R$5,50");
                break;
            case 2:
                System.out.println("bom apetite, vai lhe custar R$10,20");
                break;
            case 3:
                System.out.println("tenha um excelente drink, vai lhe custar R$4,00");
                break;
            case 4:
                System.out.println("tenha um excelente drink, vai lhe custar R$3,50");
                break;
            default:
                System.out.println("opcao invalida");
        }

    }
}
