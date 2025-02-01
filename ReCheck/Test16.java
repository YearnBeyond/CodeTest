package ReCheck;

import java.util.Scanner;

public class Test16 {
    public int solution(int m,int n, int[][] arr) {
        int answer = 0;

        for (int i=0; i<m; i++) {
            for (int j =0; j<n; j++) {
                int tmp = arr[i][j];
                for (int k=0; k<n; k++) {

                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Test16 T = new Test16();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(m,n, arr));
    }
}
