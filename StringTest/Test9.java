package StringTest;

import java.io.IOException;
import java.util.Scanner;

public class Test9 {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        int lt = 0;
        int rt = s.length() - 1;

        while (lt<rt) {
            // lt번호가 알파벳이 아닌 경우 건너뛴다.
            if(!Character.isAlphabetic(charArray[lt])) {
                lt++;
            }
            // rt번호가 알파벳이 아닌 경우도 건너뛴다.
            else if (!Character.isAlphabetic(charArray[rt])) {
                rt --;
            }
            // 둘다 알파벳인 경우 교환한다.
            else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArray);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test9 T = new Test9();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }

}
