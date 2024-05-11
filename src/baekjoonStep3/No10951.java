package baekjoonStep3;

import java.io.*;
import java.util.StringTokenizer;

public class No10951 {
    public static void main(String... args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while ((input = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(input);
            bufferedWriter.write(String.valueOf(Integer.parseInt(stringTokenizer.nextToken())+Integer.parseInt(stringTokenizer.nextToken())));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
