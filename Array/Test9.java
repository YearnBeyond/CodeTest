package Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//********************************************************
// 입력받은 숫자들 중 소수만 뽑아내기
//********************************************************
// 입력받은 숫자들 중 최대값까지의 소수 여부를 에라토스테네스의 체를 사용해 한 번에 계산
// isNotPrime 배열을 사용하여 true는 소수가 아님, false는 소수임을 나타낸다.
public class Test9 {
    public List<Integer> solution(int num, int[] arr){
        // 입력받은 숫자들 중 최대값을 구한다.
        int max = 0;
        for (int x : arr) {
            max = Math.max(max, x);
        }

        // 에라토스테네스 체를 사용해 소수 여부를 미리 계산, 저장
        boolean[] isNotPrime = new boolean[max + 1];
        isNotPrime[0] = true; // 0은 소수가 아님
        isNotPrime[1] = true; // 1은 소수가 아님
        for (int i = 2; i <= Math.sqrt(max); i++) { // 특정 숫자의 배수를 제거하기만 하면 된다.
            if (!isNotPrime[i]) { // !소수가 아닌경우
                for (int j = i* i; j<= max; j =i+j) {
                    isNotPrime[j] = true;
                }
            }
        }

        // 입력한 숫자들 중 소수만 결과로 저장하겠다.
        // List 사용하여 동적으로 크기 저장
        List<Integer> result = new ArrayList<>();
        for (int x: arr) {
            if(!isNotPrime[x]) {
                result.add(x);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
		Test9 T = new Test9();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		int numArr[] = new int[num];

        for (int i =0; i< num; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int x: T.solution(num, numArr)) {
            System.out.print(x + " ");
        }
    }
}
