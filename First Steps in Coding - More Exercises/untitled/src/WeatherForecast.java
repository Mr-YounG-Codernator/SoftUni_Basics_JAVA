import java.util.Scanner;

public class WeatherForecast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String enteredWeather = scanner.nextLine();

        if(enteredWeather.equals("sunny")){
            System.out.println("It's warm outside!");
        }else {
            System.out.println("It's cold outside!");
        }

    }
}
