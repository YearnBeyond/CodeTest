package StringTest;

import java.io.IOException;
import java.util.Scanner;

// 회문 문자열 : 앞에서 읽을때나 뒤에서 읽을 때나 같은 문자열
public class Test11 {
    public String solution(String str) {
        String answer = "";

        String str1 = str.toUpperCase();
        String str2 = new StringBuilder(str1).reverse().toString();

        if (str1.equals(str2)) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test11 T = new Test11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
