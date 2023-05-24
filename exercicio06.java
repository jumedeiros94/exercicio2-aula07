import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        Scanner numeroInteiro = new Scanner(System.in);
        System.out.println("Diga um número inteiro");
        int numInt = numeroInteiro.nextInt();

        int antecessor = numInt - 1;
        int sucessor = numInt + 1;

        System.out.println("O antecessor de " + numInt  + " é " + antecessor);
        System.out.println("O sucessor de " + numInt  + " é " + sucessor);
    }
}