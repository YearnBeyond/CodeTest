package ReCheck;

import java.util.Scanner;

public class Test18 {
    public int solution(int num, int[][] arr) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Test18 T = new Test18();
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
