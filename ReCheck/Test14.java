package ReCheck;

import java.io.IOException;
import java.util.Scanner;


public class Test14 {
    public int solution(int num, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i=0; i<num; i++) {
            sum1=sum2=0;
            for (int j = 0; j < num; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 =0;
        sum2 =0;
        for (int i=0; i<num; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][num-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test14 T = new Test14();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(num, arr));
    }
}
