package StringTest;

import java.io.IOException;
import java.util.Scanner;

//replace와 parseInt를 사용해서..
public class Test22 {
    public String solution(int n, String str) {
		String answer="";

		for (int i = 0; i< n; i++) {
			String temp = str.substring(0, 7).replace('#', '1').replace('*', '0'); //0자리~ 7자리
			int num = Integer.parseInt(temp, 2); // 2진수를 10진수로 변환
			answer += (char)num;
			str = str.substring(7); // 7자리~ 끝까지 자름
		}

		return answer;
    }

    public static void main(String[] args) throws IOException {
        Test22 T = new Test22();
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String str = sc.next();

        System.out.println(T.solution(n, str));

    }
}
