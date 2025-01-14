package Array;

import java.io.IOException;
import java.util.Scanner;

// 가위바위보!
// String을 배열로 바꿔야 for each를 쓸 수 있다.
public class Test3 {
    public String solution(int n, int[] m, int[] m1){
        String result = "";

        for (int i = 0;i<n; i++) {
            int temp = m[i];
            int temp1 = m1[i];
            if (temp==temp1) {
                result+="D";
            } else if (temp==1){
                if (temp1 == 2) result+="B";
                else result+="A";
            } else if (temp==2){
                if (temp1 == 1) result+="A";
                else result+="B";
            } else {
                if (temp1 == 1) result+="B";
                else result+="A";
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
		Test3 T = new Test3();
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
