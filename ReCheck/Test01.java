package ReCheck;

import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public String solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
            }
            else if (!Character.isAlphabetic(charArray[rt])){
                rt--;
            }

            else {
                // 둘다 문자일때
                char tmp;
                tmp = charArray[lt];
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
        Test01 T = new Test01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}
