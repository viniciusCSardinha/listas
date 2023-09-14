import java.util.Scanner;

public class exerc7 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float valor = scanner.nextFloat();
        int opc = scanner.nextInt();
        int parcelas = 0;

        switch (opc){
            case 0:
            System.out.println(valor*0.9);
            break;
            case 1:
            System.out.println("quantas parcelas?");
            parcelas = scanner.nextInt();
            System.out.println(valor/parcelas);
            break;
            case 2:
            valor = valor*1.1;
            parcelas = scanner.nextInt();
            System.out.println(valor/parcelas);
            default:
            System.out.println("opção invalida");
        }
        scanner.close();
    }
}
