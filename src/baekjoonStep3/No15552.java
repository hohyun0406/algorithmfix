package baekjoonStep3;


import java.io.*;
import java.util.StringTokenizer;

public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(bufferedReader.readLine());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(bufferedReader.readLine());
            bufferedWriter.write((Integer.parseInt(st.nextToken()+Integer.parseInt(st.nextToken())))+"\n");
        }
//        bufferedWriter.close();
    }
}
