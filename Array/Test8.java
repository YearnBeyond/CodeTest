package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 입력값이 소수인지 확인하기 : 에라토스테네스 체 X
//********************************************************
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
