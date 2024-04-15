package baekjoonStep3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            int sum = A + B;

            bufferedWriter.write(sum + "\n");
        }
<<<<<<< HEAD:src/baekjoonStep3/No15552.java
//        bufferedWriter.close();
=======

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
>>>>>>> 432764e79cba1aa1630a7a2ccdf00ef036c9c2dc:src/baekjoonPractice/No15552.java
    }
}