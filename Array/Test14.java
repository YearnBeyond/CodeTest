package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 격자판 최대합 (어렵다)
// int[][] 시작
//********************************************************
public class Test14 {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE; // 최대합을 저장할 변수
        int sum1, sum2;

        for (int i=0; i<n; i++) {
            sum1=sum2=0;
            for (int j=0; j<n; j++) {
                sum1 += arr[i][j]; // 행의 합
                sum2 += arr[j][i]; // 열의 합
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;               // 초기화를 밖에서 하는 걸 주의
        for (int i=0; i<n;i++){
            // 대각선의 합
            sum1 += arr[i][i];     // 왼쪽 꼭지점 시작 대각선
            sum2 += arr[i][n-i-1]; // 오른쪽 꼭지점 시작 대각선
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test14 T = new Test14();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}