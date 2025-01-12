package StringTest;

import java.io.IOException;
import java.util.Scanner;

// 유효한 팰린드롬 : 앞에서 읽을때나 뒤에서 읽을 때나 같은 문자열
// 단 회문을 검사할 때 알파벳만 가지고 회문을 검사한다.
public class Test14 {
    public String solution(String str) {
        //String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 알파벳 대문자가 아니면.. 전부 변경
        String str2 = new StringBuilder(str).reverse().toString();
        return str.equals(str2)?"YES":"NO";
    }

    public static void main(String[] args) throws IOException {
        Test14 T = new Test14();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
