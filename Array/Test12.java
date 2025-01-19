package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// OX 문제 점수 계산, 연속으로 정답인 경우 가산있음
//********************************************************
public class Test12 {
    public int solution(int n, int[] arr) {
        int totalScore = 0; // 총 점수
        int consecutiveScore = 0; // 연속 점수

        // 가산계산을 위한 for문
        for(int i =0; i<n ; i++) {
            if (arr[i] == 1) {
                consecutiveScore++; // 맞은 문제애 대해 가산점 증가, 제일 첫번째는 0+1이므로 OK
                totalScore +=  consecutiveScore; // 총 점수에 추가
            } else {
                consecutiveScore = 0; // 틀린 경우 연속 점수를 초기화
            }
        }

        return totalScore;
    }

    public static void main(String[] args) throws IOException {
        Test12 T = new Test12();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}