package baekjoonStep4;

import java.io.*;
import java.util.StringTokenizer;

public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int X = Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[N];
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());
        for(int i =0;i<N;i++){
            arr[i] = Integer.parseInt(stringTokenizer1.nextToken());
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<X){
                bufferedWriter.write(arr[i] + " ");
            }
        }
        bufferedWriter.close();
    }
}
