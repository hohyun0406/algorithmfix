package beajoon;
//이중배열정렬하기 *********서치********
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class LV1MeetingRoomSeoyeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("총 회의가 몇개?");
        int num = sc.nextInt();
//        System.out.println(num+"개");

        int[][] meet = new int[num][2];
        //num(11)줄만큼 2자리 배열선언

        for(int i=0;i<num;i++){
            meet[i][0] = sc.nextInt(); //배열 앞자리
            meet[i][1] = sc.nextInt(); //배열 뒷자리
            //각 자리수가 num 줄만큼 입력됨

        }

        for(int i=0;i<num;i++){
            for(int j=0;j<2;j++){
                System.out.print(meet[i][j]);
            }
            System.out.println();
        }

        //** 해결못한 부분 **
        //meet[i][1]를 작은 순부터 오름차순으로 정리해야하지만 Array.sort();는 이중배열을
        //정렬하지 못함. (어떡하죠...ㅜㅜ)


        //***아래 for문 설명***
        //회의 가능한 조건 : 앞 회의 끝나는 시간보다 늦게 회의가 시작해야함.
        // == meet[i][1] 가 meet[i+1][0] 보다 클 경우
        // 위의 경우 meetingTime 에 meet[i+1][0] 를 할당함.
        // 이때 바뀌는 횟수 = 회의가 가능한 수(변수가 0부터 시작했으므로 첫 회의도 카운트됨)

        //but! 반드시 이중배열 오름차순을 해결해야하는 상황.

//        int count = 0;
//        int meetingTime = 0;
//        for(int i=0;i<num;i++){
//            if(meetingTime <= meet[i][0]){
//                meetingTime = meet[i][1];
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}