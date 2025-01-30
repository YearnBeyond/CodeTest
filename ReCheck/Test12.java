package ReCheck;

import java.io.IOException;
import java.util.Scanner;


public class Test12 {
    public int solution(int num) {
		int cnt=0;

        boolean[] isNotPrime = new boolean[num + 1];

        for (int i=2; i<=num; i++) {
            if (!isNotPrime[i]) {
                System.out.println("i : "+i);
                cnt++;
                for (int j = 2; j<=num; j= j+i) { // 배수 제외
                    isNotPrime[j] = true;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Test12 T = new Test12();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(T.solution(num));
    }
}
