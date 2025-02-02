package SlidingWindow;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 최대 매출
// 슬라이딩 윈도우
//********************************************************
public class Test01 {
    public int solution(int n, int m, int[] arr){
        int answer = Integer.MIN_VALUE;

        int i =0;
        while (i+2 < n) {
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
