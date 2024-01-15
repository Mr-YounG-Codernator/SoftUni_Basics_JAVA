public class Clock {

    public static void main(String[] args) {

        for(int hour = 0; hour <=23; hour++){
            
            for(int minute= 0; minute <= 59; minute++){

                if(hour < 10 && minute < 10){

                    System.out.println("0" + hour + ":0" + minute);
                    
                } else if (hour < 10) {

                    System.out.println("0" + hour + ":" + minute);

                } else if (minute < 10) {

                    System.out.println(hour + ":0" + minute);

                }else {

                    System.out.println(hour + ":" + minute);

                }

            }

        }
        

    }
}
