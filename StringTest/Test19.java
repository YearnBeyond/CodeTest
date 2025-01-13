package StringTest;

import java.io.IOException;
import java.util.Scanner;

// 문자열 압축
public class Test19 {
    public String solution(String str) {
		String answer="";
		str = str+" ";
		int num = 1;
		
		for (int i = 0; i< str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)){
				num++;
			} else {
				answer += str.charAt(i);
				if (num > 1) {
					answer += String.valueOf(num); //num 숫자를 String으로 변경
				}
				num=1;
			}
		}
		
		return answer;
    }

    public static void main(String[] args) throws IOException {
        Test19 T = new Test19();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));

    }
}
