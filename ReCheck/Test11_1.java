package ReCheck;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ✔️입력받은 숫자들 중에서 소수만 모두 구해서 출력하기
// 입력값 : 6
// 입력값 : 1 18 11 7 9 5
public class Test11_1 {
    public List<Integer> solution(int num, int[] numArry) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i<num; i++){
            //하나씩 꺼내서 소수여부 체크 후 저장 필요
            if (!isNotPrime(numArry[i])) {
                result.add(numArry[i]);
            }
        }
        return result;
    }

    public boolean isNotPrime(int n) {
        if (n < 2) return false; // 소수이다

        for (int i=2; i<n/2; i++) {
            if (n % i ==0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Test11_1 T = new Test11_1();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArry = new int[num];

        for (int i=0; i<num; i++) {
            numArry[i] = sc.nextInt();
        }

        for (int a : T.solution(num, numArry)) {
            System.out.print(a + " ");
        }
    }
}
