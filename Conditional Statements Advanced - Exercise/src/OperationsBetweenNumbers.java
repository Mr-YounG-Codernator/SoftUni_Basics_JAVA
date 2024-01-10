import java.util.Scanner;

public class OperationsBetweenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        String resultType = "";
        
        if(operator.equals("+") || operator.equals("-") || operator.equals("*")){
            if(operator.equals("+")){
                result = number1 + number2;
            } else if (operator.equals("-")) {
                result = number1 - number2;
            } else if (operator.equals("*")) {
                result = number1 * number2;
            }

            if(result % 2==0){
                resultType = "even";
            }else {
                resultType = "odd";
            }

            System.out.printf("%d %s %d = %.0f - %s",number1,operator,number2,result,resultType);

        } else if (operator.equals("/")) {
            if (number1==0) {
                System.out.printf("Cannot divide %d by zero",number2);
            } else if (number2 == 0) {
                System.out.printf("Cannot divide %d by zero",number1);
            }else{
                result = ((number1*1.0) / (number2*1.0));
                System.out.printf("%d / %d = %.2f",number1,number2,result);
            }

        } else if (operator.equals("%")) {
            if (number1==0) {
                System.out.printf("Cannot divide %d by zero",number2);
            } else if (number2 == 0) {
                System.out.printf("Cannot divide %d by zero",number1);
            }else {
                result = number1 % number2;
                System.out.printf("%d %% %d = %.0f",number1,number2,result);
            }
        }

    }
}
