import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int deadLineInMonths = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine())/100;

        double sumOfRate = depositSum + deadLineInMonths*((depositSum*(interestRate))/12);

        System.out.println(sumOfRate);

    }
}
