package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// N*N 격자판의 봉우리
// int[][]
//********************************************************
public class Test15 {
    public int solution(int n, int[] arr) {
        int cnt = 0;
        
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Test15 T = new Test15();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}