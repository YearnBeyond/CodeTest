package ReCheck;

import java.io.IOException;
import java.util.Scanner;

public class Test02 {
    public String solution(int num, String str) {
        String answer = "";
        String newStr = str.replace("#", "1").replace("*","0");

        for (int i = 0; i<num; i++) {
            String tmp = str.substring(i*7, (i*7)+7);
            int decimal = Integer.parseInt(tmp, 2);
            answer += (char)decimal;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test02 T = new Test02();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(T.solution(num, str));
    }
}
