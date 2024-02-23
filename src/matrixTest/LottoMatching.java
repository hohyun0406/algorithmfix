package matrixTest;

import java.util.ArrayList;
import java.util.stream.Stream;

public class LottoMatching {
    public static void main(String[] args) {

        int[] lotto = new int[6];
        int[] winningLotto = new int[6];

        int count = 0;

        for(int i=0;i<lotto.length;i++){
            lotto[i] = LottoMatching.createRandomNumber(1,8);
        }

        for(int i=0;i<lotto.length;i++){
            winningLotto[i] = LottoMatching.createRandomNumber(1,8);
        }


        for(int i = 0;i<lotto.length;i++){
            System.out.println(lotto[i]);

        }
        System.out.println();
        for(int i = 0;i<lotto.length;i++){
            System.out.println(winningLotto[i]);
        }

    }

    public static int createRandomNumber(int start, int gapBetweenStartAndEnd){
        int randomNumber = start + (int)(Math.random() * gapBetweenStartAndEnd);
        return randomNumber;
    }
}
