import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner temperaturaFahrenheit = new Scanner(System.in);
        System.out.println("Qual a temperatura em Fahrenheit?");
        double tempFahrenheit = temperaturaFahrenheit.nextDouble();

        double grausCelsius = ((tempFahrenheit - 32) * 5 )  / 9;


        System.out.println("A conversão da temperatura em Fahrenheit para graus Celcius é de: " + grausCelsius);
    }
}