package Array;

import java.io.IOException;
import java.util.Scanner;

// 피보나치 수열 : 앞의 두수의 합
public class Test5 {
    public int[] solution(int n){
        int[] array = new int[n];
		array[0] = 1;
		array[1] = 1;

        for (int i =2; i<n; i++) {
			array[i] = array[i-1]+array[i-2];
        }

        return array;
    }

    public static void main(String[] args) throws IOException {
		Test5 T = new Test5();
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();

        for(int c: T.solution(n)) {
            System.out.print(c +" ");
        }
    }
}
