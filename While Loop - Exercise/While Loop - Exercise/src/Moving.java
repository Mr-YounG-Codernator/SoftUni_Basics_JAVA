import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int sumOfFreeSpace = width * length * height;
        int sumOfBoxSpace = 0;
        int difference;

        while (sumOfBoxSpace <= sumOfFreeSpace){

            String command = scanner.nextLine();

            if(command.equals("Done")){

                difference = Math.abs(sumOfBoxSpace-sumOfFreeSpace);
                System.out.printf("%d Cubic meters left.",difference);
                break;

            }

            int boxSpace = Integer.parseInt(command);
            sumOfBoxSpace += boxSpace;

        }

        difference = Math.abs(sumOfBoxSpace-sumOfFreeSpace);

        if(sumOfBoxSpace > sumOfFreeSpace){

            System.out.printf("No more free space! You need %d Cubic meters more.",difference);

        }

    }
}
