package ReCheck;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 입력받은 숫자들중 소수만 출력하기
public class Test06 {
    public List<Integer> solution(int[] arr) {
        // 입력받은 숫자들중 가장 큰수부터 구하기
        int max = 0;
        for (int x: arr) {
            max = Math.max(max, x);
        }

        boolean[] isNotPrime = new boolean[max + 1]; // max보다 1크기 주의
        isNotPrime[0] = true;  // 0은 소수아님
        isNotPrime[1] = true;  // 1은 소수아님
        // 에라토스테네스로 소수들 개수부터 확인하기
        for (int i = 2; i <= Math.sqrt(max) ; i++) {
            if (!isNotPrime[i]) {
                for (int j = i*i; j<= max; j=i+j) { // 시작점, 증가하는부분 주의
                    isNotPrime[j] = true;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int x : arr) {
            if (!isNotPrime[x]) {
                result.add(x);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Test06 T = new Test06();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i< num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x: T.solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
