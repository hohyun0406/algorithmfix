package baekjoonStep4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3052 {
    public static void main(String[] args) throws IOException {

        boolean[] arr = new boolean[42];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(bufferedReader.readLine()) % 42] = true;
        }

        int count = 0;
        for(boolean value : arr) {
            if(value){
                count++;
            }
        }
        System.out.println(count);
    }
}