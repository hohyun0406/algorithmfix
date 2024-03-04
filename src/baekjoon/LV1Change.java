package baekjoon;


import java.util.Scanner;

public class LV1Change {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 1000 - sc.nextInt();  //잔돈 금액
            int count = 0;  //잔돈 개수
            int[] money = {500, 100, 50, 10, 5, 1};  //잔돈 종류
            int i = 0;
            while (n != 0) {
                if (n - money[i] >= 0) {
                    n -= money[i];
                    count++;
                } else {
                    i++;
                }
            }

            System.out.print(count);
        }

}