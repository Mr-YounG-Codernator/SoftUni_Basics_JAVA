import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalNumber = Integer.parseInt(scanner.nextLine());
        int enteredNumber = Integer.parseInt(scanner.nextLine());

        while(!(totalNumber <= enteredNumber)){

            enteredNumber += Integer.parseInt(scanner.nextLine());

        }

        System.out.println(enteredNumber);
    }
}
