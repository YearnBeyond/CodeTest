package StringTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2차원 배열의 구간합
public class Test2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // int[][] c = 배열 선언
        int c[][] = new int[a+1][a+1];

        // for a
        // for a
        // st = new StringTokenizer(br.readLine());
        // int [i][j] += Integer.parseInt(st.nextToken());
        for (int i = 1; i<= a ; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j<= a ; j++){
                c[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2차원 배열의 구간합
        //for a
        // for a
        // 합배열 저장하기
        // D[i][j] = D[i-1][j] + D[i][j-1] + D[i-1][j-1]+ A[i][j];
        int D[][] = new int[a+1][a+1];
        for (int i = 1; i<= a ; i++){
            for (int j = 1; j<= a ; j++){
                D[i][j] = D[i-1][j] + D[i][j-1]+ c[i][j];
            }
        }

        // for b
          // 질의 계산 및 출력
          // (x1,y1) = (3,4), (x2, y2) = (2,2)
          // 결과 = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];

          // D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] - D[x1-1][y1-1]
        for (int i =0 ; i<b ; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());


            System.out.println(D[x1][y1] - D[x-1][y1] - D[x1][y-1] - D[x-1][y-1]);
        }


    }
}