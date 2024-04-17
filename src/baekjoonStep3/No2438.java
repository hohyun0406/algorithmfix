package baekjoonStep3;

import java.io.*;

public class No2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        for(int i = 1;i<=N;i++){
            for(int j = 1;j<=i;j++){
                bufferedWriter.write("*");
                bufferedWriter.flush();
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
