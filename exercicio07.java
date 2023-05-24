import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner salarioPorHora = new Scanner(System.in);
        System.out.println(" Quanto você ganha por hora trabalhada?");
        double salario = salarioPorHora.nextDouble();

        Scanner horaTrabahada = new Scanner(System.in);
        System.out.println(" Quantas horas você trabalha?");
        double horas = horaTrabahada.nextDouble();

        double salarioBruto = salario * horas;
        double descontoImpostodeRenda = 11 / salarioBruto * 100;
        double descontoInss = 8 / salarioBruto * 100;
        double descontoSindicato = 5 / salarioBruto * 100;
        double salarioLiquido = salarioBruto - descontoSindicato - descontoInss - descontoImpostodeRenda;

        System.out.println("O valor do salário bruto é de: R$" + salarioBruto);
        System.out.println("Você pagou ao INSS: R$" + descontoInss);
        System.out.println("Você pagou ao sindicato: R$" + descontoSindicato);
        System.out.println("O valor liquido do seu salário é : R$" + salarioLiquido);
        System.out.println("O sucessor de " + numInt  + " é " + sucessor);
    }
}