import java.util.Scanner;

public class Harvest {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     int yard = Integer.parseInt(scanner.nextLine());
     double grapeKG = Double.parseDouble(scanner.nextLine());
     int littersNeeded = Integer.parseInt(scanner.nextLine());
     int workers = Integer.parseInt(scanner.nextLine());

     double vineYard = yard * 0.40;
     double totalGrapesKG = vineYard * grapeKG;
     double totalLitters = totalGrapesKG / 2.5;
     double difference = Math.abs(littersNeeded - totalLitters);

     if(totalLitters < littersNeeded){
         System.out.println("It will be a tough winter! More " + Math.round(Math.floor(difference)) + " liters wine needed.");
     }else if(totalLitters >= littersNeeded){
         System.out.println("Good harvest this year! Total wine: " + Math.round(Math.floor(totalLitters)) + " liters.");
         System.out.println(Math.round(Math.ceil(difference)) + " liters left -> " + Math.round(Math.ceil(difference / workers))+" liters per person.");
     }

    }
}
