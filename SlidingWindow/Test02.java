package SlidingWindow;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 최대 매출 (선생님 풀이)
// 슬라이딩 윈도우 알고리즘 (길이가 3짜리인 창문을 계속 옆으로 만든다)
// 2중 for문으로 풀지 않도록..
//********************************************************
public class Test02 {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int sum = 0;

        // 첫번째 window
        for (int i=0; i<m; i++) { // m=3으로 제일 앞의 3개의 합
            sum+=arr[i];
        }

        answer = sum;

        for (int j=m; j<n; j++) { // m=3에서 부터 n=10까지
            sum += (arr[j] - arr[j-m]); // j-3
            answer = Math.max(answer, sum);
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Test02 T = new Test02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));

    }
}
