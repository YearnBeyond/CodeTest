package TwoPointers;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
//
//********************************************************
public class Test03 {
    public int solution(int n, int m, int[] arr){
        int answer = 0;


        return answer;
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
