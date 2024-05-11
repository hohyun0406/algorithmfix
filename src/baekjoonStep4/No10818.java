package baekjoonStep4;

import java.io.*;
import java.util.StringTokenizer;

//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//출력
//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
//
//예제 입력 1
//5
//20 10 35 30 7
//예제 출력 1
//7 35
public class No10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        int min, max;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int firstNum = Integer.parseInt(stringTokenizer.nextToken()); //1

        if (stringTokenizer.hasMoreTokens()) { //2
            int nextNum = Integer.parseInt(stringTokenizer.nextToken());
            if(firstNum>nextNum){
                max = firstNum;
                min = nextNum;
            } else {
                min = firstNum;
                max = nextNum;
            }
            for(int i =2;i<N;i++){ //최솟값 or 최댓값이랑 비교
                int tempNum = Integer.parseInt(stringTokenizer.nextToken());
                if(max<tempNum){
                    max = tempNum;
                } else if (min>tempNum) {
                    min = tempNum;
                }
            }

            bufferedWriter.write(min+" "+max);
        } else { // 1만 존재할 경우 바로 출력
            bufferedWriter.write(firstNum+" "+firstNum);
        }
        bufferedWriter.newLine(); // 줄 바꿈
        bufferedWriter.flush(); // 출력 버퍼 비우기
        bufferedWriter.close(); // BufferedWriter 닫기
    }
}
