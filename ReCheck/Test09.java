package ReCheck;

import java.io.IOException;
import java.util.Scanner;

// 숫자뒤집기..
// 카드뒤집기로 생각하자.
public class Test09 {
    public int solution(int originalNum) {
		int remainingNum = originalNum;                  // 남은 카드 더미 = 내가 뽑은 카드 4321
        int reversedNum = 0;                             // 뒤집은 카드

		while (remainingNum > 0){                        // 남은 카드 더미가 없을때까지
			int lastDigit = remainingNum % 10;           // 제일 밑에 있던 카드
			reversedNum = reversedNum * 10 + lastDigit; // 뒤집은 카드를 한장 내리고, 제일 밑에 있는 카드를 위로 추가
			remainingNum = remainingNum / 10;           // 제일 밑에 있던 카드 자리수를 없애버린다.
		}
        return reversedNum;
    }

    public static void main(String[] args) throws IOException {
        Test09 T = new Test09();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(T.solution(num));
    }
}
