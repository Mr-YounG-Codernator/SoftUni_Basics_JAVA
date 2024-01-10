import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String monthName = scanner.nextLine();
        int stayingDays = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.00;
        double apartmentPrice = 0.00;

        if(monthName.equals("May") || monthName.equals("October")){
            if(stayingDays > 7 && stayingDays <= 14){
                studioPrice = (stayingDays*50)*0.95;
                apartmentPrice = stayingDays*65;
            }else if(stayingDays > 14){
                studioPrice = (stayingDays*50)*0.70;
                apartmentPrice = (stayingDays*65)*0.90;
            }else {
                studioPrice = stayingDays*50;
                apartmentPrice = stayingDays*65;
            }

        } else if (monthName.equals("June") || monthName.equals("September")) {
            if(stayingDays > 14){
                studioPrice = (stayingDays*75.20)*0.80;
                apartmentPrice = (stayingDays*68.70)*0.90;
            }else {
                studioPrice = stayingDays*75.20;
                apartmentPrice = stayingDays*68.70;
            }
        } else if (monthName.equals("July") || monthName.equals("August")) {
            if(stayingDays >14){
                studioPrice = stayingDays*76.00;
                apartmentPrice = (stayingDays*77.00)*0.90;
            }else {
                studioPrice = stayingDays*76.00;
                apartmentPrice = stayingDays*77.00;
            }
        }

        System.out.printf("Apartment: %.2f lv.\n",apartmentPrice);
        System.out.printf("Studio: %.2f lv.",studioPrice);

    }
}
