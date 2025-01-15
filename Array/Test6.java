package Array;

import java.io.IOException;
import java.util.Scanner;

// 피보나치 수열 : 앞의 두수의 합
// 배열을 쓰지 않고, 손코딩하는 경우
public class Test6 {
    public void solution(int n){
        int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");

        for (int i =2; i<n; i++) {
			c = a+b;
			System.out.print(c+ " ");
			a = b;
			b = c;
        }
    }

    public static void main(String[] args) throws IOException {
		Test6 T = new Test6();
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();

        T.solution(n);
    }
}
