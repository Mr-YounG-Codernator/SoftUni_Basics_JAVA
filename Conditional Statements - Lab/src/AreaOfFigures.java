import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String enteredFigure = scanner.nextLine();

        String square = "square";
        String rectangle = "rectangle";
        String circle = "circle";
        String triangle = "triangle";

        if(enteredFigure.equals(square)){

            double num1 = Double.parseDouble(scanner.nextLine());
            double faceOfSquare = num1*num1;

            System.out.printf("%.3f",faceOfSquare);

        }
        else if(enteredFigure.equals(rectangle)){

            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            double faceOfRectangle = num1*num2;

            System.out.printf("%.3f",faceOfRectangle);

        }
        else if(enteredFigure.equals(circle)){

            double num1 = Double.parseDouble(scanner.nextLine());
            double faceOfCircle = Math.PI*(num1*num1);

            System.out.printf("%.3f",faceOfCircle);

        }
        else if(enteredFigure.equals(triangle)){

            double num1Side = Double.parseDouble(scanner.nextLine());
            double num2Height = Double.parseDouble(scanner.nextLine());
            double faceOfTriangle = (num1Side*num2Height)/2;

            System.out.printf("%.3f",faceOfTriangle);

        }
    }
}
