import java.util.Scanner;

public class exerc8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float altura = scanner.nextFloat();
        float peso = scanner.nextFloat();
        scanner.close();

        double imc = peso / (Math.pow(altura, 2));

        if (imc >= 40) {
            System.out.println("Obesidade mórbida.");
        } else if (imc >= 35) {
            System.out.println("Obesidade moderada.");
        } else if (imc >= 30) {
            System.out.println("Obesidade leve.");
        } else if (imc >= 25) {
            System.out.println("Sobrepeso, um regime leve pode ajudar.");
        } else if (imc >= 18.5) {
            System.out.println("Peso ideal, muito bem.");
        } else {
            System.out.println("Abaixo do peso ideal.");
        }

    }

}
