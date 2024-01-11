import java.util.Scanner;

public class NumbersN_To_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

       /*

       int number = Integer.parseInt(scanner.nextLine());

        for(int i = 1; number >= i; number--){
            System.out.println(number);
        }
        */

        //на лектора решението

        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }

    }
}
