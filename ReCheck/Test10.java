package ReCheck;

import java.io.IOException;
import java.util.Scanner;


public class Test10 {
    public int solution(int num, int[][] arr) {
        int result = Integer.MIN_VALUE;



        return result;
    }

    public static void main(String[] args) throws IOException {
        Test10 T = new Test10();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for (int i =0; i<num; i++){
            for (int j=0; j<num; j++)
            arr[i][j] = sc.nextInt();
        }
        System.out.print(T.solution(num, arr));
    }
}
