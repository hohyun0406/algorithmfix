package baekjoonPractice;

import java.util.Scanner;

public class No2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        if (dice1==dice2){
            if(dice2==dice3){
                System.out.println(10000+((dice3)*1000));
            } else {
                System.out.println(1000+((dice2)*100));
            }
        } else if (dice1==dice3){
            System.out.println(1000+((dice3)*100));
        }  else if (dice2==dice3){
            System.out.println(1000+((dice2)*100));
        } //case 3 - 1
        else if (dice1>dice2) {
            if (dice1>dice3){
                System.out.println(dice1*100);
            } else {
                System.out.println(dice3*100);
            }
        } //case 3 -2
        else if (dice2>dice3){
            System.out.println(dice2*100);
        } else {
            System.out.println(dice3*100);
        }
    }
}
