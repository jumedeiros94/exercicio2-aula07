import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner salarioHoraTrabalhada = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora trabalhada?");
        double salario = salarioHoraTrabalhada.nextDouble();

        Scanner horaTrabalhada = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora trabalhada?");
        double horas = horaTrabalhada.nextDouble();

        double salarioMes = salario * horas;

        System.out.println("Seu salário referido do mês é: R$" + salarioMes );


    }
}