package matrixTest;

import java.util.Random;

public class LottoMatching {
    public static void main(String[] args) {
        IBuyLotto buy = new BuyLotto();
        IDrawLotto draw = new DrawLotto();
        IMatchLotto match = new MatchLotto();

        int[] arr = new int[6];

        arr = draw.createLottoWithoutDuplicates(arr); //겹치지 않는 로또 만들기
        arr = draw.sortAscending(arr); //오름차순 정렬
        draw.printLotto(arr); //출력(?)하기
    }
}

interface IBuyLotto {int[] buyLotto();}
interface IDrawLotto {
    int createRandomNumber(int start, int end);
    int[] createLottoWithoutDuplicates(int[] arr);
    int[] sortAscending(int[] arr);
    void printLotto(int[] arr); //리턴 값이 없으면 void를 쓴다.
}
interface IMatchLotto {
    int findsame(int[] originLotto, int[] myLotto);
    String rank(int count);
}
class BuyLotto implements IBuyLotto {
    @Override
    public int[] buyLotto() {
        return new int[0];
    }
}
class DrawLotto implements IDrawLotto {
    @Override
    public void printLotto(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d \t", i);
        }
    }
    @Override
    public int[] createLottoWithoutDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = createRandomNumber(1, 8); //랜덤 숫자 뽑기
            boolean check = false;
            for (int j =0;j<i;j++) { //뽑은 인덱스 값까지만 비교
                if (arr[j] == randomNumber) {
                    check = true;
                }
            }
            if (check == false) {
                arr[i] = randomNumber;
            } else {
                i--;
            }
        }
        return arr;
    }

//    나쁜 코드?
//
//       for(int i=0;i<lotto.length;i++){
//            winningLotto[i] = LottoMatching.createRandomNumber(1,8);
//            for (int j = 0; j < i; j++) {//방금 뽑은 번호를 이미 뽑았던 자리의 번호랑만 비교해줘
//                if (winningLotto[i] == winningLotto[j]) {
//                    i--;
//                    break; //만약에 똑같으면 처음으로 돌아가서 같은 자리 다른 번호 뽑는거 해줘(i--)
//                }
//            }
//        }


    @Override
    public int createRandomNumber(int start, int end) {
        Random random = new Random();
        return start+random.nextInt(end);
    }
    @Override
    public int[] sortAscending(int[] arr) {
        for (int i=0;i<arr.length-1;i++){ //비교는 배열 길이 -1번 수행
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]) { //낮은 인덱스 값이 크면 큰 인덱스 값으로 밀어줘
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}

class MatchLotto implements IMatchLotto {
    @Override
    public int findsame(int[] originLotto, int[] myLotto) {
        return 0;
    }

    @Override
    public String rank(int count) {
        return null;
    }
}










//package matrixTest;
//
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.stream.Stream;
//
//public class LottoMatching {
//    public static void main(String[] args) {
//
//        int[] lotto = new int[6];
//        int[] winningLotto = new int[6];
//
//
//        for(int i=0;i<lotto.length;i++){
//            lotto[i] = LottoMatching.createRandomNumber(1,8);
//            for (int j = 0; j < i; j++) {//방금 뽑은 번호를 이미 뽑았던 자리의 번호랑만 비교해줘
//                if (lotto[i] == lotto[j]) {
//                    i--;
//                    break; //만약에 똑같으면 처음으로 돌아가서 같은 자리 다른 번호 뽑는거 해줘(i--)
//                }
//            }
//        }
//
//        for(int i=0;i<lotto.length;i++){
//            winningLotto[i] = LottoMatching.createRandomNumber(1,8);
//            for (int j = 0; j < i; j++) {//방금 뽑은 번호를 이미 뽑았던 자리의 번호랑만 비교해줘
//                if (winningLotto[i] == winningLotto[j]) {
//                    i--;
//                    break; //만약에 똑같으면 처음으로 돌아가서 같은 자리 다른 번호 뽑는거 해줘(i--)
//                }
//            }
//        }
//
//        int temp = 0; //임시값
//
//        for(int i = 0; i < lotto.length - 1; i++) { //첫 자리 빼고 큰 값 5개(6-1) 뽑아줘
//            for(int j= 1 ; j < lotto.length-i; j++) { //2개씩 비교하면서 앞 배열이 더 크면 뒤로 밀어줘
//                if(lotto[j]<lotto[j-1]) {
//                    temp = lotto[j-1];
//                    lotto[j-1] = lotto[j];
//                    lotto[j] = temp;
//                }
//            }
//        }
//
//        for(int i = 0; i < winningLotto.length - 1; i++) { //첫 자리 빼고 큰 값 5개(6-1) 뽑아줘
//            for(int j= 1 ; j < winningLotto.length-i; j++) { //2개씩 비교하면서 앞 배열이 더 크면 뒤로 밀어줘
//                if(winningLotto[j]<winningLotto[j-1]) {
//                    temp = winningLotto[j-1];
//                    winningLotto[j-1] = winningLotto[j];
//                    winningLotto[j] = temp;
//                }
//            }
//        }
//
//
//        for(int i = 0;i<lotto.length;i++){
//            System.out.print(lotto[i]+" ");
//        }
//        System.out.println();
//
//        for(int i = 0;i<lotto.length;i++){
//            System.out.print(winningLotto[i]+" ");
//        }
//        System.out.println();
//
//        int count = 0;
//
//        for (int i = 0;i<lotto.length;i++){
//            for (int j = 0 ;j<lotto.length;j++){
//                if (lotto[i]==winningLotto[j]){
//                    count += 1;
//                }
//            }
//        }
//
//        System.out.println(count);
//        switch (count){
//            case 6 : System.out.println("1등입니다");
//            case 5 : System.out.println("2등입니다");
//            case 4 : System.out.println("3등입니다");
//            case 3 : System.out.println("4등입니다");
//            case 2 : System.out.println("꽝입니다");
//        }
//
//    }
////
//    public int createRandomNumber(int start, int gapBetweenStartAndEnd){
//        int randomNumber = start + (int)(Math.random() * gapBetweenStartAndEnd);
//        return randomNumber;
//    }
//}
//
//class LottoDraw{
//
//}
//
//class BuyLotto{
////
//}