package baekjoonStep4;

import java.io.*;
import java.util.StringTokenizer;

public class No10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int[] arr = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0;i<N;i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int count = 0;
        int v = Integer.parseInt(bufferedReader.readLine());
        for(int i=0;i<arr.length;i++){
            if(v==arr[i]){
                count++;
            }
        }

        System.out.println(count);

    }
}
