import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        float temp= 0;

        System.out.println("Informe a temperatura em Calcius:");
        temp = Sc.nextFloat();
        double F = 9.0 * temp / 5.0 + 32.0;

        System.out.println(temp + " convertidos para Fahrenheit são "+ F);

    }
}
