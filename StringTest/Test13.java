package StringTest;

import java.io.IOException;
import java.util.Scanner;

// 회문 문자열 : 앞에서 읽을때나 뒤에서 읽을 때나 같은 문자열
public class Test13 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length() ;

        for (int i = 0; i< len /2; i++) {
            if (str.charAt(i) != str.charAt(len -i -1)) {
                return "NO";
            }
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test13 T = new Test13();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
