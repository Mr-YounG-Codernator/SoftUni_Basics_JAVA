import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double degreeCelsius = Double.parseDouble(scanner.nextLine());
        double degreesFahrenheit;

        degreesFahrenheit = (9.0/5.0)*degreeCelsius + 32.0;

        System.out.printf("%.2f",degreesFahrenheit);

    }
}
