package bjdemo;

import java.util.Scanner;

public class No4470 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//        scanner.nextLine();

        for(int i=1;i<=n;i++){
            String s = scanner.nextLine();
            System.out.printf("%d. %s",i,s);
        }

    }
}
