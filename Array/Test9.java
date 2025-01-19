package Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


// 숫자를 입력받아 뒤집어서 저장하고
// 소수인지 확인 후 소수이면 출력하도록 한다.
public class Test9 {
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i< num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i=0; i< n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;   // 숫자의 마지막 자리수 추출
                res = res * 10 + t; // 뒤집힌 숫자 생성 시작
                tmp = tmp / 10;     //마지막 자리 제거
            }
            if (isPrime(res)) {
                result.add(res); // 소수일 경우 리스트에 추가한다.
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Test9 T = new Test9();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x: T.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}