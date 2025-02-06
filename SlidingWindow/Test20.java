package SlidingWindow;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 임의의 문제..
// 연속적인 수열의 합.. (Test02랑 풀이가 동일함)
// 슬라이딩 윈도
//********************************************************
public class Test20 {
    public int solution(int n, int k, int[] arr){
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum+=arr[i];
        }
        int max = sum;

        for (int j=k; j<n; j++) {
            sum += (arr[j] - arr[j-k]);
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        Test20 T = new Test20();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n ;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, k, arr));

    }
}
