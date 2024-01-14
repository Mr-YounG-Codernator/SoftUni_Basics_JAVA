import java.util.Scanner;

public class Cake {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int totalCakePieces = length * width;

        int totalPiecesTaken = 0;
        int difference;

        while(totalPiecesTaken <= totalCakePieces){

            String text = scanner.nextLine();

            if(text.equals("Stop")){

                difference = Math.abs(totalPiecesTaken - totalCakePieces);
                System.out.printf("%d pieces are left.",difference);
                break;

            }

            int cakePerPerson = Integer.parseInt(text);
            totalPiecesTaken += cakePerPerson;

        }

        difference = Math.abs(totalPiecesTaken - totalCakePieces);

        if(totalPiecesTaken > totalCakePieces){

            System.out.printf("No more cake left! You need %d pieces more.",difference);

        }

    }
}
