package SlidingWindow;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 최대 길이 연속부분수열

//********************************************************
public class Test06 {
    public int solution(int n, int m, int[] arr){
        int cnt = 0;
        int lt = 0;

        for (int i =0; i<n; i++) {
            int check = 0;
            if (arr[i] == 0) {
                arr[i] = 1;
                lt = i;
                check++;
            }
            if (arr[i] == 1)

            while (check >= 2) {
                arr[--lt] = 0;

            }

        }

        return cnt;
    }
    public static void main(String[] args) throws IOException {
        Test06 T = new Test06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,m,arr));

    }
}
