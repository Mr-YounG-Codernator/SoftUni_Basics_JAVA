import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int sumOfAll = 0;


        for(int i = 1; i <= n; i++){

           int n1 = Integer.parseInt(scanner.nextLine());

            if(n1 > maxValue){

                maxValue = n1;

            }

            sumOfAll += n1;

        }

        int sumOfAllWithoutMax = Math.abs(sumOfAll - maxValue);

        if(maxValue == sumOfAllWithoutMax){

            System.out.println("Yes");
            System.out.println("Sum = " + maxValue);

        }
        if(maxValue != sumOfAllWithoutMax) {

            System.out.println("No");
            System.out.println("Diff = " + Math.abs(maxValue - sumOfAllWithoutMax));

        }

    }
}
