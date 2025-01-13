package StringTest;

import java.io.IOException;
import java.util.Scanner;

// 문자열 압축 : indexOf보다는 문자 비교와 카운트를 활용한다.
// 아래 코드는 연속된 문자열만 체크하지 KEKESSKESSKE 와 같은 문자열은 체크하지 못한다.
public class Test17 {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        int count = 1;

        for(int i = 0; i < str.length() -1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) { // 연속된 글자를 비교
                count++;
            } else {
                answer.append(str.charAt(i));
				if (count > 1) {
					answer.append(count);
				}
				count = 1; // 카운트 초기화
			}
        }
      return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Test17 T = new Test17();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));

    }
}
