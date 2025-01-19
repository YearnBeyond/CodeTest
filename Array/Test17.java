package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
//
//********************************************************
public class Test17 {
    public int solution(int n, int[] arr) {
        int cnt = 0;
        
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Test17 T = new Test17();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}