package StringTest;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// 문자열 뒤집기
public class Test8 {
    public ArrayList<String> solution(int n, String[] s) {
        ArrayList<String> answer = new ArrayList<>();
        // 문자열을 전부 뒤집는 게 아니라 특정 문자열만 뒤집기..
        for (String x : s) {
            // 이정도는 손코딩 가능해야함..
            char[] cArray = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {
                char tmp = cArray[lt];
                cArray[lt] = cArray[rt];
                cArray[rt] = tmp; // 위치를 서로 바꿈
                lt++;
                rt--;
            }
            String tmp = String.valueOf(cArray); // x를 String 화
            answer.add(tmp); // ArrayList에 추가 시 add 메소드
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test8 T = new Test8();
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

