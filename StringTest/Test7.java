package StringTest;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 문자열 뒤집기
public class Test7 {
    public ArrayList<String> solution(int n, String[] s) {
        ArrayList<String> answer = new ArrayList<>();

        for (String str : s) {
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test7 T = new Test7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i<n; i++) {
            s[i]=sc.next();
        }
        for (String x : T.solution(n,s)) {
            System.out.println(x);
        }
    }
}

