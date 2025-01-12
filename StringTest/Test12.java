package StringTest;

import java.io.IOException;
import java.util.Scanner;

// 회문 문자열 : 앞에서 읽을때나 뒤에서 읽을 때나 같은 문자열
public class Test12 {
    public String solution(String str) {
        String str1 = str.toUpperCase();
        String str2 = new StringBuilder(str1).reverse().toString();

        return str1.equals(str2)?"YES":"NO";
    }

    public static void main(String[] args) throws IOException {
        Test12 T = new Test12();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
