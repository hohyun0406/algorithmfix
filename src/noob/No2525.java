package noob;

import java.util.Scanner;

public class No2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        int calMin = min + sc.nextInt();

        int resultMin;

        if(calMin<60){
            resultMin = calMin;
        } else {
            while(calMin>=60){
                calMin -= 60;
                hour++;
            };
            resultMin = calMin;
        }

        if(hour>=24){
            hour-=24;
        }
        System.out.println(hour + " " + resultMin);
    }
}
