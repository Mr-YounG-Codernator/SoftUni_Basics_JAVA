import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String deposit = scanner.nextLine();
        double deposito = 0.00;
        double totalDepositSum = 0.0;

        while(!deposit.equals("NoMoreMoney")){

            deposito = Double.parseDouble(deposit);

            if(deposito < 0){
                System.out.println("Invalid operation!");
                break;
            }

            totalDepositSum += deposito;
            System.out.printf("Increase: %.2f%n", deposito);
            deposit = scanner.nextLine();


        }
        if(deposito < 0){
            System.out.printf("Total: %.2f",totalDepositSum);
        }else {
            System.out.printf("Total: %.2f",totalDepositSum);
        }

    }
}
