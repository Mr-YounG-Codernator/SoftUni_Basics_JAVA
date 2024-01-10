import java.util.Scanner;

public class SummerOutfit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int celsius = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();
        String outfit; //outfit = "";
        String shoes; // shoes = "";

        if(celsius >= 10 && celsius <= 18){
            if(timeOfTheDay.equals("Morning")){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
                System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
            } else if (timeOfTheDay.equals("Afternoon")) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
            } else if (timeOfTheDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
            }
        } else if (celsius > 18 && celsius <=24) {
            if(timeOfTheDay.equals("Morning")){
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
            } else if (timeOfTheDay.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
            } else if (timeOfTheDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
            }
        } else if (celsius >= 25) {
            if(timeOfTheDay.equals("Morning")){
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
            } else if (timeOfTheDay.equals("Afternoon")) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
                System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
            } else if (timeOfTheDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
            }

            //МОЖЕ БЕЗ ТОЛКОВА SYSTEM.OUT.PRINT-ОВЕ МОЖЕ ДА СЕ СЛОЖИ САМО ЕДИН В КРАЯ

        }
    }
}
