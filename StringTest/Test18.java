package StringTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

// 문자열 압축 : indexOf보다는 문자 비교와 카운트를 활용한다.
// HashSet을 사용해 연속되지 않는 문자열도 체크하도록 한다.
// 입력값 : KEKESSKESSKE
public class Test18 {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
		HashMap<Character, Integer> charCount = new HashMap<>();    // 문자 등장 횟수 저장
        // int count = 1;

		// 1. 문자 등장 횟수 카운트
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);    // 그냥 .get() 메소드가 아니라 .getOrDefault() 메소드를 사용해 기본값을 0으로 지정
		}
		
		// 2. 결과 문자열 생성
		for (char c : str.toCharArray()) {
			if (charCount.containsKey(c)) { // 아직 처리되지 않은 문자라면
				answer.append(c);  // 문자 추가
				if (charCount.get(c) > 1 ) {
					answer.append(charCount.get(c));
				}
				charCount.remove(c); // 처리한 문자는 제거한다.
			}
		}
		
        
      return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Test18 T = new Test18();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));

    }
}
