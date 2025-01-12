package StringTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long S[] = new long[n+1];
        long C[] = new long[m];
        long answer = 0; // 최종결과를 위한 값 세팅

        st = new StringTokenizer(br.readLine());
        // 구간 합 구하기
        for (int i = 1; i<=n ; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken()); // 구간합
        }

        // 구간 합의 모든 값에 % 연산 수행하기
        for (int i = 0; i< n; i++) {
            int result = (int) S[i] % m; // 나머지 확인
            if (result == 0) {
                answer++;
            }
            C[result]++; // 나머지가 0,1,2인 것의 개수 더하기... 이 값이 어디에 저장되는거지..?ㅠㅠ
        }

        // 구간 합에서 나머지가 동일 한 부분 구하기
        for (int j = 0; j < m; j++) {
            if (C[j] > 0) {
                answer = answer + (C[j] * (C[j] - 1) /2);
            }
        }
        System.out.println(answer);
    }
}
