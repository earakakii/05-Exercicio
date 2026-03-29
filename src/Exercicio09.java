import java.util.Scanner;

public class Exercicio09 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int valor;
        int unidade, dezena, centena;
        int valorInvertido;
        System.out.println("insira um valor com 3 digitos ");
        valor = sc.nextInt();

        unidade = valor % 10;
        dezena = valor / 10 % 10;
        centena = valor / 100;
        valorInvertido =  unidade * 100 + dezena * 10 + centena;

        System.out.println(unidade + "" + dezena * 10 + centena);
        System.out.println(valorInvertido);
    }
}
