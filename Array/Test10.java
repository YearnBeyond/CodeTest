package Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//********************************************************
// 입력받은 숫자들 뒤집어서 소수만 뽑아내기
//********************************************************
// 숫자 뒤집기 !
//********************************************************
public class Test10 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();


        for (int i = 0; i< n; i++) {
            int remainedNum = arr[i];
            int reversedNum = 0;
            while (remainedNum>0) {
                int lastDigit = remainedNum % 10;
                reversedNum = reversedNum * 10 + lastDigit;
                remainedNum = remainedNum / 10;
            }
            // 소수인지 판별
            if (isPrime(reversedNum)) {
                result.add(reversedNum);
            }
        }
        return result;
    }

    public boolean isPrime(int reversedNum) {
        if (reversedNum < 2) return false; // 소수가 아니다.

        for (int i=2; i<reversedNum; i++) {
            if (reversedNum % i ==0) { // 소수가 아니다.
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        Test10 T = new Test10();
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