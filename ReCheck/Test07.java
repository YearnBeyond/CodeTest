package ReCheck;

import java.io.IOException;
import java.util.Scanner;

// 숫자 뒤집기 ㅜㅜ
public class Test07 {
    public int solution(int num) {
        int temp = num;
        int result = 0;

        while (temp > 0) {
            int t = temp % 10;
            result = result * 10 + t;
            temp = temp / 10;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Test07 T = new Test07();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(T.solution(num));
    }
}
