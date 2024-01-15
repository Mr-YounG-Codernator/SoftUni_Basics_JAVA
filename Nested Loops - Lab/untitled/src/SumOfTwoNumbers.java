import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startPoint = Integer.parseInt(scanner.nextLine());
        int endPoint = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for(int x1 = startPoint; x1 <= endPoint; x1++){

            for(int x2 = startPoint; x2 <= endPoint; x2++){

                counter++;

                int sum = x1 + x2;
                if(sum == magicNumber){

                    System.out.printf("Combination N:%d (%d + %d = %d)%n",counter,x1,x2,magicNumber);
                    return;

                }

            }

        }

        System.out.printf("%d combinations - neither equals %d",counter,magicNumber);

    }
}
