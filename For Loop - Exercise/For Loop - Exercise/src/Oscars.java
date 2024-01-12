import java.util.Scanner;

public class Oscars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int raterEvaluation = Integer.parseInt(scanner.nextLine());
        double pointsCounter = academyPoints;

        for(int i = 1; i <= raterEvaluation; i++){

            String name = scanner.nextLine();
            double raterName = Double.parseDouble(scanner.nextLine());

            pointsCounter += (name.length() * raterName) / 2;

            if(pointsCounter > 1250.5){

                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,pointsCounter);

                break;
            }

        }

       if(pointsCounter < 1250.5){

            double difference = Math.abs(pointsCounter - 1250.5);

            System.out.printf("Sorry, %s you need %.1f more!",actorName,difference);
        }




    }
}
