package ReCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test17 {
    public List<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        

        return answer;
    }

    public static void main(String[] args) {
        Test17 T = new Test17();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m ;i++) {
            arr2[i] = sc.nextInt();
        }

        for(int x : T.solution(n, arr1, m, arr2)) {
            System.out.print(x+ " ");
        }
    }
}
