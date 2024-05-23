package baekjoonStep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int count = 0;
        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                count = i;
            }
        }
        sb.append(max).append("\n").append(count);
        System.out.println(sb);
    }
}