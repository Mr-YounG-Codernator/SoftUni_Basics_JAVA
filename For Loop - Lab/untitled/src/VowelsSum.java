import java.util.Scanner;

public class VowelsSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sum = 0;

        for(int i = 0; i <= text.length() - 1; i++){

            char symbol = text.charAt(i);

            //лекторско решение

            switch (symbol){
                case 'a':
                    sum +=1;
                    break;
                case 'e':
                    sum +=2;
                    break;
                case 'i':
                    sum +=3;
                    break;
                case 'o':
                    sum +=4;
                    break;
                case 'u':
                    sum +=5;
                    break;

            }

            /*
            if(symbol == 'a'){
                sum += 1;
            }
            if (symbol == 'e') {
                sum += 2;
            }
            if (symbol == 'i') {
                sum += 3;
            }
            if (symbol == 'o') {
                sum += 4;
            }
            if (symbol == 'u') {
                sum += 5;
            }
             */
        }

        System.out.println(sum);

    }
}
