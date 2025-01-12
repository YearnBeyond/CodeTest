package StringTest;

import java.io.IOException;
import java.util.Scanner;

// 숫자만 추출
public class Test15 {
    public int solution(String str) {
        int result = 0;
        String answer = "";

        for (int i = 0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) answer += str.charAt(i);
        }

        result = Integer.parseInt(answer);
        return result;
    }

    public static void main(String[] args) throws IOException {
        Test15 T = new Test15();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
