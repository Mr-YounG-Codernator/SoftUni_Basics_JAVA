import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int trainingTaxPerYear = Integer.parseInt(scanner.nextLine());

        double basketballSneakersPrice = trainingTaxPerYear - trainingTaxPerYear*(40/100.0);
        double basketballOutfitPrice = basketballSneakersPrice - basketballSneakersPrice*(20/100.0);
        double basketBallPrice =basketballOutfitPrice*(25/100.0);
        double basketballAccessories = basketBallPrice*(20/100.0);

        double totalPrice = trainingTaxPerYear + basketballSneakersPrice + basketballOutfitPrice + basketBallPrice + basketballAccessories;


        System.out.println(totalPrice);

    }
}
