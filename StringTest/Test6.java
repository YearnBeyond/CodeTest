package StringTest;


import java.io.IOException;
import java.util.Scanner;

// 문자열 뒤집기
public class Test6 {
    public StringBuilder solution(int n, String[] s) {
        StringBuilder result = new StringBuilder();

        for (String str : s) {
            result.append(new StringBuilder(str).reverse().append("\n"));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Test6 T = new Test6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i<n; i++) {
            s[i]=sc.next();
        }
        System.out.println(T.solution(n,s));
    }
}

