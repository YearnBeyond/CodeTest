package StringTest;

import java.io.IOException;
import java.util.Scanner;

// substring(i*7, (i + 1)*7) 로 7자리씩 추출
public class Test21 {
    public String solution(int n, String str) {
		String answer="";
		String temp = "";
		
		for(int i = 0; i<str.length(); i++) {
			if (str.charAt(i) == '#') {
				temp += 1;
			} else if (str.charAt(i) == '*') {
				temp += 0;
			}
		}

		// 7자리씩 끊어서 처리
		for(int i = 0; i<n; i++) {
			String newStr = temp.substring(i*7, (i + 1)*7); // 7자리를 추출
			int decimal = Integer.parseInt(newStr, 2); // 와우 2진수를 10진수로 변환하는 매우 간단한 방법
			answer += (char) decimal;  // 아스키 코드 값을 문자로 변환
		}

		return answer;
    }

    public static void main(String[] args) throws IOException {
        Test21 T = new Test21();
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String str = sc.next();

        System.out.println(T.solution(n, str));

    }
}
