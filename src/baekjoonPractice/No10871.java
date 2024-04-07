package baekjoonPractice;

import java.util.Scanner;

public class No10871 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int arraySize = sc.nextInt();

            int num = sc.nextInt();

            int cnt = 0;

            int array[] = new int[arraySize];

            int answerArray[] = new int[arraySize];


            for(int i=0;i<arraySize;i++) {

                array[i]=sc.nextInt();

            }


            for(int j=0;j<arraySize;j++) {

                if(array[j]<num){

                    answerArray[cnt]=array[j];

                    cnt++;

                }

            }

            for(int k=0;k<cnt;k++) {

                System.out.print(answerArray[k]+" ");

            }}}


