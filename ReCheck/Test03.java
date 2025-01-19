package ReCheck;

import java.io.IOException;
import java.util.Scanner;

public class Test03 {
    public String solution(int num, String str) {
        String answer = "";

        for (int i =0; i<num; i++) {
            String temp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int tempNum = Integer.parseInt(temp, 2);
            answer += (char)tempNum;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test03 T = new Test03();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(T.solution(num, str));
    }
}
