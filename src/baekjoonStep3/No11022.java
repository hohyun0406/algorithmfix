package baekjoonStep3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No11022 {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        int T = scanner.nextInt();
        int testCase = Integer.parseInt(bufferedReader.readLine());

//        for(int i=1;i<=T;i++){
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
//        }

        for(int i=1;i<=testCase;i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
        }
        bufferedReader.close();

    }
}
