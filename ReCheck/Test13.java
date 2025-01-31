package ReCheck;

import java.io.IOException;
import java.util.Scanner;


public class Test13 {
    public int solution(int num, int[] arr) {
		int result=0;
        int cnt = 0;

        for (int i=0; i<num; i++) {
            if (arr[i] == 1) {
                cnt++;
                result += cnt;
            } else if (arr[i] == 0) {
                cnt = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Test13 T = new Test13();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(num, arr));

    }
}
