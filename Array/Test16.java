package Array;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 임시 반장 정하기
// 와 이것도 실버라니..
// int[][]
//********************************************************
public class Test16 {
    public int solution(int n, int[][] arr) {
        int max = Integer.MIN_VALUE;
        int answer=0;

        for (int i=0; i<n; i++) { // i: 고정된 학생 번호 (0-based)
            int cnt = 0; // 나는 항상 초기화 변수의 위치가 헷갈리네. 고정된 i반 학생과 같은 반인 학생은 몇명있는지 확인하기 위한 변수
            for (int j = 0; j < n; j++) { // j: 비교 대상 학생 번호
                if (i == j) continue; // 자기 자신은 비교하지 않음
                for (int k = 0; k < 5; k++) { // k: 학년 (0-based)
                    if (arr[i][k] == arr[j][k]) { // 같은 반이면
                        cnt++;
                        break;       // 학년 중 한 번이라도 같은 반이면 추가 후 종료
                    }
                }
            }
            // 여기까지 i번 학생의 cnt 값이 계산된 상태
            if (cnt > max) {
                max = cnt;
                answer = i + 1; // 학생 번호는 +1로 출력
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Test16 T = new Test16();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][5]; // n * 5 배열 (학생 수 * 학년)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();  // 각 학년별 반 정보를 입력받음
            }
        }

        System.out.println(T.solution(n, arr));
    }
}