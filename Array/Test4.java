package Array;

import java.io.IOException;
import java.util.Scanner;

// 가위바위보! 이게 더 속도 빨라.
// A가 이기는 경우만 모아서 처리
public class Test4 {
    public String solution(int n, int[] m, int[] m1){
        String result = "";

        for (int i = 0;i<n; i++) {
            if(m[i] == m1[i]) result += "D";
            else if(m[i]==1 && m1[i]==3) result += "A";
            else if(m[i]==2 && m1[i]==1) result += "A";
            else if(m[i]==3 && m1[i]==2) result += "A";
            else result += "B";
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
		Test4 T = new Test4();
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        int[] m = new int[n];
        int[] m1 = new int[n];
		
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
		}
        for (int i = 0; i < n; i++) {
            m1[i] = sc.nextInt();
        }
        for(char c : T.solution(n, m, m1).toCharArray()) { // String을 배열로 바꿔야 for each를 쓸 수 있다.
            System.out.println(c);
        }

    }
}
