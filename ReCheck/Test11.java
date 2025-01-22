package ReCheck;

import java.io.IOException;
import java.util.Scanner;


public class Test11 {
    public int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		int P = 1000;

		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == c) {
				P=0;
				answer[i] = P;
			} else {
				P++;
				answer[i] = P;
			}
		}
		P = 1000;
		for (int i = str.length() -1; i>=0; i--) {
			if (str.charAt(i) == c) {
				P=0;
			} else {
				P++;
				answer[i] = Math.min(P, answer[i]);
			}
		}

		return answer;
    }

    public static void main(String[] args) throws IOException {
        Test11 T = new Test11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
		char c = sc.next().charAt(0);

		for (int x : T.solution(str, c)) {
			System.out.print(x+" ");
		}
    }
}
