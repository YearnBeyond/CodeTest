package SlidingWindow;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 최대 매출 (내 풀이)
// 내가 알고리즘을 생각하고 푸는 게 아니라 직관적으로 푸는 경향이 있따.
//********************************************************
public class Test01 {
    public int solution(int n, int m, int[] arr){
        int answer = Integer.MIN_VALUE;

        int i =0;
        while (i+2 < n) { // i+2라는 값이 내가 계산한거라 좋은 방법이 아닐듯..
            int tmp = arr[i] + arr[i+1] + arr[i+2];
            if (tmp > answer) answer = tmp;
            i++;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Test01 T = new Test01();
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
