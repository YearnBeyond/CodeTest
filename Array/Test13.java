package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 등수구하기..
// 같은 점수는 동일한 등수, 그 다음 등수는 1,1,2등
// 이중 for문
//********************************************************
public class Test13 {
    public int[] solution(int n, int[] arr) {
        int[] result = new int[n];

        for (int i = 0; i<n ; i++){
            int cnt = 1; // 꼭 밖에서 초기화할 필요없다.
            for (int j =0; j<n; j++) {
                if (arr[j] > arr[i]) {
                    cnt++;
                }
            }
            result[i] = cnt;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Test13 T = new Test13();
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