package Array;

import java.io.IOException;
import java.util.Scanner;

// 소수들 모두 구하기 : 에라토스테네스 체로 풀기.
// 어렵다.
// 암기 필요..
public class Test7 {
    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];
//        for (int i=2; i<=n; i++){
        for (int i=2; i<= Math.sqrt(n); i++){
            if (ch[i]==0) {
                answer++;
                for (int j = i; j<= n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
		Test7 T = new Test7();
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();

        System.out.println(T.solution(n));
    }
}
