package SlidingWindow;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 연속 부분수열
// 합이 특정숫자 M이 되는 경우는 몇번?
// 2중 for문..  비권장
// 시간복잡도 O(N^2).. 어마어마한 시간복잡도
//********************************************************
public class Test03 {
    public int solution(int n, int m, int[] arr){
        int cnt = 0;

        for (int i = 0; i<n; i++) {
            int sum =0;
            for (int j = i; j<n; j++) {
                sum += arr[j];
                if (sum == m) {
                    cnt++;
                    break;
                } else if (sum > m) {
                    break;
                }
            }
        }

        return cnt;
    }
    public static void main(String[] args) throws IOException {
        Test03 T = new Test03();
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
