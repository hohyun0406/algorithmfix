package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class LV1Nanjaengs2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] heights = new int[9];
        int heightsSum = 0;

        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
            heightsSum += heights[i];
        }

        int fakeNan1 = 0;
        int fakeNan2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int a = i + 1; a < 9; a++) {
                if (heightsSum - heights[i] - heights[a] == 100) {
                    fakeNan1 = i;
                    fakeNan2 = a;
                }
            }
        }

        heights[fakeNan1] = 0;
        heights[fakeNan2] = 0;

        Arrays.sort(heights);

        for (int i = 2; i < heights.length; i++) {
            System.out.println(heights[i]);
        }

    }
}
