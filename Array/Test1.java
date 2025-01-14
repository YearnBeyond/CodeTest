package Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 자신의 바로 앞 수보다 큰 수 출력, 첫번째 수는 무조건 출력
public class Test1 {
    public ArrayList<Integer> solution(int n, int[] m){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(m[0]);
        for (int i = 1; i < m.length; i++) {
            if (m[i] >m[i-1]) {
				result.add(m[i]);
			}
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
		Test1 T = new Test1();
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        int[] m = new int[n];
		
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
		}
		
		for (int result : T.solution(n, m)) {
			
			System.out.print(result + " ");
		}
    }
}
