package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// N*N 격자판의 봉우리
// int[][]
//********************************************************
public class Test15 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {-1, 0, 1, 0};
    public int solution(int n, int[][] arr) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k =0; k<4; k++){
                    int nx = i+ dx[k];  // 행
                    int ny = j+ dx[k];  // 열
//                    if (arr[nx][ny] >= arr[i][j] && nx>=0 nx<n && ny>=0 && ny <n)
                    if (nx>=0 && nx<n && ny>=0 && ny <n && arr[nx][ny] >= arr[i][j]) {
                        flag = false; // 봉우리가 아니다.
                        break;
                    }
                }
                if (flag) cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Test15 T = new Test15();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}