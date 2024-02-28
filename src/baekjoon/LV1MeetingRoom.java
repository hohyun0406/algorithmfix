package baekjoon;

import java.util.Scanner;

public class LV1MeetingRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()]; //총 길이

    }

}

interface IMaxRoom {
    int[] lineupMeetingRoomList(int[] arr);
}



class MaxRoom implements IMaxRoom{

    @Override
    public int[] lineupMeetingRoomList(int[] arr) {
        return new int[0];
    }
}