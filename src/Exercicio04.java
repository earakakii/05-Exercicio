import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        double ValorSalario;
        int QuiloWatt;


        System.out.println(" Informe o valor do salario minimo em R$ ");
        ValorSalario = ent.nextDouble();

        System.out.println(" Informe a quantidade de QuiloWatt ");
        QuiloWatt = ent.nextInt();

        double ValorQuilowatt, ContaEnergia;

        ValorQuilowatt = ValorSalario / 7 / 100;

        ContaEnergia = QuiloWatt * ValorQuilowatt;

        System.out.println(" Valor da conta R$ " + ContaEnergia);
        System.out.println(" O valor do QuiloWatt é R$ " + ValorQuilowatt);
        System.out.println(" O Valor da conta com 10% de desconto R$ " + ContaEnergia * 0.90);
    }
}