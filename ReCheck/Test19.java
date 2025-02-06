package ReCheck;

import java.util.Scanner;

public class Test19 {
    public int solution(int n, int m, int[] arr) {
        int sum = 0;

        int cnt = 0;
        return cnt;
    }

    public static void main(String[] args) {
        Test19 T = new Test19();
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
