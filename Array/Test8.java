package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 입력받은 숫자들 중 소수만 뽑아내기
//********************************************************
// 입력받은 숫자들 중 최대값까지의 소수 여부를 에라토스테네스의 체를 사용해 한 번에 계산
// isNotPrime 배열을 사용하여 true는 소수가 아님, false는 소수임을 나타낸다.
public class Test8 {
    public boolean solution(int n){
        if (n < 2) return false;

        for (int i =2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // 나눠떨어지면 소수가 아니다..
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
		Test8 T = new Test8();
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();

        System.out.println("소수 여부 : "+T.solution(n));
    }
}
