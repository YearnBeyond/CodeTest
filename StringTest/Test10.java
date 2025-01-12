package StringTest;

import java.io.IOException;
import java.util.Scanner;

// 중복문자제거
// index of 사용 : s.indexOf(s.charAt(i)는 글자의 제일 첫번째 위치 반환
public class Test10 {
    public String solution(String s) {
        String answer = "";
        for (int i = 0; i< s.length(); i++) {
            //System.out.println(s.charAt(i) + " "+i + " "+ s.indexOf(s.charAt(i)));
            if (s.indexOf(s.charAt(i)) == i) {
                answer += s.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test10 T = new Test10();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }

}
