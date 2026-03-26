import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double ValorHoraAula, PorcentagemINSS, SalarioBruto;
        int NumeroHorasTrabalhadas;

//   LETRA A-) calcula-se o valor do salário bruto (valor da hora-aula multiplicada pelo número de horas trabalhadas)


        // ENTRADA DE DADOS:
        System.out.println(" Digite o Valor da hora-aula ---> R$ ");
        ValorHoraAula = ent.nextDouble();

        System.out.println(" Digite o Número de Horas Trabalhadas ---> ");
        NumeroHorasTrabalhadas = ent.nextInt();

        // SAIDA DE DADOS:
        SalarioBruto = ValorHoraAula * NumeroHorasTrabalhadas;

        // LETRA B-) A partir do salário bruto, calcula-se o valor que será descontado referente ao INSS.

        // ENTRADA DE DADOS
        System.out.println(" Digite a Porcentagem de Desconto do INSS ---> ");
        PorcentagemINSS = ent.nextDouble();

        double ValorDoDesconto;
        ValorDoDesconto = SalarioBruto * PorcentagemINSS / 100;

        // Letra C -) Calcula-se o salário líquido mensal (valor do salário bruto menos o valor do desconto do INSS.

        double SalarioLiquido;
        SalarioLiquido = SalarioBruto - ValorDoDesconto;
        System.out.println(" O Valor do Salário Liquido é --> R$ " +
                String.format("% .2f ", SalarioLiquido));





    }
}