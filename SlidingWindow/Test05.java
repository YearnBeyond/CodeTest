package SlidingWindow;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 연속된 자연수의 합
// 앞의 문제와 정말 비슷함..
// 하나 더 생각해보자면 입력받은 숫자 n의 크기만큼 for 루프를 돌릴게 아니라 n/2 + 1까지만 해도 된다.
// 너무 큰 연속된 자연수 2개를 더하면 15를 넘어가기 때문..
//********************************************************
public class Test05 {
    public int solution(int n){
        int answer = 0;
        int sum =0;
        int lt =0;

        for (int rt = 0; rt <n; rt++) {
            sum += rt;
            if (sum == n) answer++;

            while (sum>= n) {
                lt++;
                sum -= lt;
                if (sum == n) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Test05 T = new Test05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.solution(n));

    }
}
