package ReCheck;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 소수들 모두 구하기 : 에라토스테네스 체로 풀기.
//********************************************************
// 에라토스테네스의 체 : 소수인지 직접 확인하는 방식 X, 소수의 배수를 제외하는 방식 O
// 제일 첫숫자(2,3,5,7..)만 cnt++
// 첫숫자의 배수들은 전부 true 처리
public class Test05 {
    public int solution(int num) {
        if (num < 2) return 0; // 소수가 존재하지 않음

        boolean[] notPrime = new boolean[num + 1]; // + 1로 설정한 이유는 배열의 인덱스와 숫자를 일치시키기 위해,  false로 초기화(소수다)
        int cnt = 0;

        for (int i = 2; i<=num; i++) { // 모든 숫자를 전부 탐색하며 cnt++하므로 sqrt를 안씌운다.
            if (!notPrime[i]) {  // 기본값false에 !를 씌워 = true,
                cnt++;
                for (int j = i; j<=num; j=j+i) {
                    notPrime[j] = true; // 소수가 아닌게 맞다.
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Test05 T = new Test05();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(T.solution(num));
    }
}