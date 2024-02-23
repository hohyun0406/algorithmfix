package matrixTest;

import java.util.Random;

public class RandomLotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        //중복되지 않은 상태
        lotto = createArrayWithoutDuplicates(lotto);

        lotto = sortAscening(lotto);

        printLotto(lotto);
    }

    private static void printLotto(int[] lotto) {
    }

    private static int[] sortAscening(int[] lotto) {
        for(int i = 0;i<lotto.length;i++){
            for(int j=0;j<lotto.length-1;j++){
                if(lotto[j]>lotto[j+1]){
                    int temp = lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j+1] = temp;
                }
            }
        }
        return lotto;
    }

    private static int[] createArrayWithoutDuplicates(int[] lotto) {
        for(int i=0;i<6;i++){
            int randomNumber = createRandomNumber(1,45);
            boolean check = false;
            for(int j=0;j<6;j++){
                if(lotto[j] == randomNumber){
                    check = true;
                }
            }
            if(check==false){
                lotto[i] = randomNumber;
            } else {
                i--;
            }
        }

        return lotto;
    }

    private static int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt();
    }


}