import java.util.Scanner;

public class SmallShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.00;

        switch (product){
            case "coffee":
                if(city.equals("Sofia")){
                    price = 0.50;
                } else if (city.equals("Plovdiv")) {
                    price = 0.40;
                } else if (city.equals("Varna")) {
                    price = 0.45;
                }
                break;
            case "water":
                if(city.equals("Sofia")){
                    price = 0.80;
                } else if (city.equals("Plovdiv")) {
                    price = 0.70;
                } else if (city.equals("Varna")) {
                    price = 0.70;
                }
                break;
            case "beer":
                if(city.equals("Sofia")){
                    price = 1.20;
                } else if (city.equals("Plovdiv")) {
                    price = 1.15;
                } else if (city.equals("Varna")) {
                    price = 1.10;
                }
                break;
            case "sweets":
                if(city.equals("Sofia")){
                    price = 1.45;
                } else if (city.equals("Plovdiv")) {
                    price = 1.30;
                } else if (city.equals("Varna")) {
                    price = 1.35;
                }
                break;
            case "peanuts":
                if(city.equals("Sofia")){
                    price = 1.60;
                } else if (city.equals("Plovdiv")) {
                    price = 1.50;
                } else if (city.equals("Varna")) {
                    price = 1.55;
                }
                break;
        }

        System.out.println(price*quantity);

        //Задача направена от лектора долу е моята

        /*
        double sum;

        if(product.equals("coffee")){
            switch (city){
                case "Sofia":
                    sum = quantity*0.50;
                    System.out.println(sum);
                    break;
                case "Plovdiv":
                    sum = quantity*0.40;
                    System.out.println(sum);
                    break;
                case "Varna":
                    sum = quantity*0.45;
                    System.out.println(sum);
                    break;
            }
        } else if (product.equals("water")) {
            switch (city){
                case "Sofia":
                    sum = quantity*0.80;
                    System.out.println(sum);
                    break;
                case "Plovdiv":
                case "Varna":
                    sum = quantity*0.70;
                    System.out.println(sum);
                    break;
            }
        } else if (product.equals("beer")) {
            switch (city){
                case "Sofia":
                    sum = quantity*1.20;
                    System.out.println(sum);
                    break;
                case "Plovdiv":
                    sum = quantity*1.15;
                    System.out.println(sum);
                    break;
                case "Varna":
                    sum = quantity*1.10;
                    System.out.println(sum);
                    break;
            }
        } else if(product.equals("sweets")){
            switch (city){
                case "Sofia":
                    sum = quantity*1.45;
                    System.out.println(sum);
                    break;
                case "Plovdiv":
                    sum = quantity*1.30;
                    System.out.println(sum);
                    break;
                case "Varna":
                    sum = quantity*1.35;
                    System.out.println(sum);
                    break;
            }
        } else if (product.equals("peanuts")) {
            switch (city){
                case "Sofia":
                    sum = quantity*1.60;
                    System.out.println(sum);
                    break;
                case "Plovdiv":
                    sum = quantity*1.50;
                    System.out.println(sum);
                    break;
                case "Varna":
                    sum = quantity*1.55;
                    System.out.println(sum);
                    break;
            }
        }

        */





        // Втори вариант с първи вход да е градът

        /*

        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if(city.equals("Sofia")){
            switch (product){
                case "coffee":
                    double sumCoffee = quantity*0.50;
                    System.out.println(sumCoffee);
                    break;
                case "water":
                    double sumWater = quantity*0.80;
                    System.out.println(sumWater);
                    break;
                case "beer":
                    double sumBeer = quantity*1.20;
                    System.out.println(sumBeer);
                    break;
                case "sweets":
                    double sumSweets = quantity*1.45;
                    System.out.println(sumSweets);
                    break;
                case "peanuts":
                    double sumPeanuts = quantity*1.60;
                    System.out.println(sumPeanuts);
                    break;
            }
        } else if (city.equals("Plovdiv")) {
            switch (product){
                case "coffee":
                    double sumCoffee = quantity*0.40;
                    System.out.println(sumCoffee);
                    break;
                case "water":
                    double sumWater = quantity*0.70;
                    System.out.println(sumWater);
                    break;
                case "beer":
                    double sumBeer = quantity*1.15;
                    System.out.println(sumBeer);
                    break;
                case "sweets":
                    double sumSweets = quantity*1.30;
                    System.out.println(sumSweets);
                    break;
                case "peanuts":
                    double sumPeanuts = quantity*1.50;
                    System.out.println(sumPeanuts);
                    break;
            }
        }
        else if(city.equals("Varna")){
            switch (product){
                case "coffee":
                    double sumCoffee = quantity*0.45;
                    System.out.println(sumCoffee);
                    break;
                case "water":
                    double sumWater = quantity*0.70;
                    System.out.println(sumWater);
                    break;
                case "beer":
                    double sumBeer = quantity*1.10;
                    System.out.println(sumBeer);
                    break;
                case "sweets":
                    double sumSweets = quantity*1.35;
                    System.out.println(sumSweets);
                    break;
                case "peanuts":
                    double sumPeanuts = quantity*1.55;
                    System.out.println(sumPeanuts);
                    break;
            }
        }
         */
    }
}
