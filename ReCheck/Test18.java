package ReCheck;

import java.util.Scanner;

public class Test18 {
    public int solution(int n, int m, int[] arr) {
        int sum = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt=0; rt<n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                cnt++;
            }
            while(sum >= m) {
                sum -= arr[lt];
                lt++;

                if (sum == m) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Test18 T = new Test18();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
