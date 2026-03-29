import java.util.Scanner;

public class Exercicio08 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int valor1, valorTotal;

        System.out.println("insira um número com 3 digitos (100 - 999) ");
        valor1 = sc.nextInt();

        valorTotal = valor1 % 100/ 10;
        System.out.println(" dezena = " + valorTotal);
    }
}
