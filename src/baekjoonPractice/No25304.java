package baekjoonPractice;

import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long price = sc.nextLong();
        int productTypeNumber = sc.nextInt();
        long priceSum = 0;

        for (int i = 1; i <= productTypeNumber; i++) {
            priceSum += sc.nextLong() * sc.nextLong();
        }

        if (price == priceSum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}