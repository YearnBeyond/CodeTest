package Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 앞 수보다 큰 수 확인
public class Test2 {
    public int solution(int n, int[] m){
        int result = 0;

        for (int i = 0; i< m.length ; i++) {
            if (m[i+1] > m[i]) {
                result++;
            }
        }


        return result;
    }

    public static void main(String[] args) throws IOException {
		Test2 T = new Test2();
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        int[] m = new int[n];
		
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
		}
        System.out.print(T.solution(n, m));
    }
}
