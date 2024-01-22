import java.util.Enumeration;
import java.util.Scanner;

public class ReportSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i <= number; i += 3){

            if(i != 0){

                System.out.println(i);

            }

        }

    }
}
