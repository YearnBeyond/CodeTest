package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 멘토링
// 4중 for문
// (멘토, 멘티) = (4 *4 ) = 16가지
// 매우 복잡함..
//********************************************************
public class Test17 {
    public int solution(int m,int n, int[][] arr) {
        int answer =0;

        for (int i=1; i<=4; i++) { // 4가지 경우의 수
            for (int j = 1; j <= 4; j++) { // 4가지 경우의 수
                int cnt = 0;
                for (int k = 0; k < m; k++) { // 행
                    int Pi = 0; // 위치 초기화
                    int Pj = 0; // 위치 초기화
                    for (int s = 0; s < n; s++) { // 열
                        // ex) (3,1)
                        if (arr[k][s] == i) { // 첫항에 오는 경우의 수의 숫자(3)와 입력값이 동일한 경우
                            Pi = s;
                        } else if (arr[k][s] == j) { // 둘째항에 오는 경우의 수의 숫자(1)와 입력값이 동일한 경우
                            Pj = s;
                        }
                    }
                    // Pi가 Pj보다 앞에 있어야 등수를 체크하는데 의미가 있음
                    if (Pi < Pj) cnt++; // cnt의 값이 3이면 정답에 해당
                }
                if (cnt == m) answer++; // cnt의 값이 3인 개수 체크
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test17 T = new Test17();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(m, n, arr));
    }
}