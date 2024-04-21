package baekjoonStep3;

import java.io.*;

public class No2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());//줄 개수 ex 5
        for(int i = 1;i<=N;i++){//줄 바꾸기. 1번째줄 2번째줄~N번째 줄까지
            for(int k=N-1;k>=i;k--){//공백 줄어들면서 찍힘 ex 4..3..2..1..0
                bufferedWriter.write(" ");
                bufferedWriter.flush();
            }
            for(int j = 1;j<=i;j++){//별 늘어나면서 찍힘 ex 1..2..3..4..5
                bufferedWriter.write("*");
                bufferedWriter.flush();
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
