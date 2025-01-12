package StringTest;


import java.io.IOException;
import java.util.Scanner;

// 문자열 뒤집기
public class Test5 {
    public String solution(int n, String s) {

        String answer = "";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test5 T = new Test5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            String s = sc.next();
            String result = new StringBuilder(s).reverse().toString();
            System.out.println(result);
        }
//        for (int i = 0; i<n; i++) {
//            String s = sc.next();
//           // String result = "";
//            StringBuilder result = new StringBuilder();
//            for (int j=s.length() - 1; j>=0 ; j--) {
//                result.append(s.charAt(j));
//            }System.out.println(result.toString());
//        }

 //       System.out.println(T.solution(n, s));
    }
}

