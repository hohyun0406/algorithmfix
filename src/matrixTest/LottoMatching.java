package matrixTest;

import java.util.ArrayList;
import java.util.stream.Stream;

public class LottoMatching {
    public static void main(String[] args) {

        int[] lotto = new int[6];
        int[] winningLotto = new int[6];


        for(int i=0;i<lotto.length;i++){
            lotto[i] = LottoMatching.createRandomNumber(1,8);
            for (int j = 0; j < i; j++) {//방금 뽑은 번호를 이미 뽑았던 자리의 번호랑만 비교해줘
                if (lotto[i] == lotto[j]) {
                    i--;
                    break; //만약에 똑같으면 처음으로 돌아가서 같은 자리 다른 번호 뽑는거 해줘(i--)
                }
            }
        }

        for(int i=0;i<lotto.length;i++){
            winningLotto[i] = LottoMatching.createRandomNumber(1,8);
            for (int j = 0; j < i; j++) {//방금 뽑은 번호를 이미 뽑았던 자리의 번호랑만 비교해줘
                if (winningLotto[i] == winningLotto[j]) {
                    i--;
                    break; //만약에 똑같으면 처음으로 돌아가서 같은 자리 다른 번호 뽑는거 해줘(i--)
                }
            }
        }

        int temp = 0; //임시값

        for(int i = 0; i < lotto.length - 1; i++) { //첫 자리 빼고 큰 값 5개(6-1) 뽑아줘
            for(int j= 1 ; j < lotto.length-i; j++) { //2개씩 비교하면서 앞 배열이 더 크면 뒤로 밀어줘
                if(lotto[j]<lotto[j-1]) {
                    temp = lotto[j-1];
                    lotto[j-1] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        for(int i = 0; i < winningLotto.length - 1; i++) { //첫 자리 빼고 큰 값 5개(6-1) 뽑아줘
            for(int j= 1 ; j < winningLotto.length-i; j++) { //2개씩 비교하면서 앞 배열이 더 크면 뒤로 밀어줘
                if(winningLotto[j]<winningLotto[j-1]) {
                    temp = winningLotto[j-1];
                    winningLotto[j-1] = winningLotto[j];
                    winningLotto[j] = temp;
                }
            }
        }


        for(int i = 0;i<lotto.length;i++){
            System.out.print(lotto[i]+" ");
        }
        System.out.println();

        for(int i = 0;i<lotto.length;i++){
            System.out.print(winningLotto[i]+" ");
        }
        System.out.println();

        int count = 0;

        for (int i = 0;i<lotto.length;i++){
            for (int j = 0 ;j<lotto.length;j++){
                if (lotto[i]==winningLotto[j]){
                    count += 1;
                }
            }
        }

        System.out.println(count);
        switch (count){
            case 6 : System.out.println("1등입니다");
            case 5 : System.out.println("2등입니다");
            case 4 : System.out.println("3등입니다");
            case 3 : System.out.println("4등입니다");
            case 2 : System.out.println("꽝입니다");
        }

    }



    public static int createRandomNumber(int start, int gapBetweenStartAndEnd){
        int randomNumber = start + (int)(Math.random() * gapBetweenStartAndEnd);
        return randomNumber;
    }
}
class LottoDraw{

}

class BuyLotto{

}