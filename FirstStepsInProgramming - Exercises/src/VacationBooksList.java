import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pageNumbers = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numbersOfDays = Integer.parseInt(scanner.nextLine());

        int totalReadingHours = pageNumbers/pagesPerHour;
        int totalReadingDays = totalReadingHours/numbersOfDays;

        System.out.println(totalReadingDays);
    }
}
