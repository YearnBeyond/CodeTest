package ReCheck;

import java.util.Scanner;

// N*N 격자판의 봉우리
public class Test15 {
    public int solution(int num, int[][] arr) {
        int cnt = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1,0, 1, 0 };

        for (int i=0; i<num; i++) {
            for (int j = 0; j < num; j++) {
                boolean check = false;
                // 어떻게 상하, 좌우와 비교할 것인가
                for (int k=0; k<4; k++){
                    int x = dx[k];
                    int y = dy[k];
                    if (i+x>=0 && i+x <num && j+y>=0 && j+y <num && arr[i][j] <= arr[i+x][j+y]) {
                        check = true;
                    }
                }
                if (!check) {
                    System.out.println("봉우리 대상입니다.");
                    System.out.println("위치 : (i,j) = ("+i+","+j+")");
                    System.out.println("값 : " + arr[i][j]);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Test15 T = new Test15();
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
