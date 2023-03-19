import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1;
        int valor2;
        String operador;

        System.out.println("Insira o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.println("Insira o Segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.println("Insira o operador: ");
        operador = scanner.next();

        if (operador.equals("+")) {
            System.out.println("O resultado é: " + (valor1 + valor2));
        } else if (operador.equals("-")) {
            System.out.println("O resultado é: " + (valor1 - valor2));
        } else if (operador.equals("*")) {
            System.out.println("O resultado é: " + (valor1 * valor2));
        } else if (operador.equals("/")) {
            System.out.println("O resultado é: " + (valor1 / valor2));
        } else {
            System.out.println("Operador inválido");
        }

    }
}
