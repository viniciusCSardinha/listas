import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float valorHora = scanner.nextFloat();
        int trabHoras = scanner.nextInt();
        float imposto = scanner.nextFloat();
        float comissao = scanner.nextFloat();
        scanner.close();

        float salarioBruto = valorHora * trabHoras;
        float salarioLiquido = 0;
        if (trabHoras >= 120) {
            salarioLiquido = (salarioBruto + comissao) - imposto;
        } else {
            salarioLiquido = salarioBruto - imposto;
        }
        System.out.println(salarioBruto);
        System.out.println(salarioLiquido);

    }
}
