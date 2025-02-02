package TwoPointers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//********************************************************
// 두 배열 합치기
// - 라이브 코딩으로 물어볼 수 있는 문제..
// - 정렬 알고리즘이 아닌, 투포인터 알고리즘 사용할 줄 아는가?
// - 정렬 시간복잡도 : O(nlogn)
// - 투포인터 : O(n)
// - 입력받은 첫번째 배열의 위치 : P1 포인트, a[P1]
// - 입력받은 두번째 배열의 위치 : P2 포인트, b[P2]
// List.add
// a[P1] < b[P2].... 작은걸 리스트에 add
//********************************************************
public class Test01 {
    public List<Integer> solution(int n, int m, int[] narr, int[] marr){
        List<Integer> answer = new ArrayList<>();

        int P1 = 0 ,P2 = 0;
        while (P1 < n && P2 < m) {
            if (narr[P1] < marr[P2]) {
                answer.add(narr[P1++]);
               // P1++;
            } else {
                answer.add(marr[P2++]);
               // P2++;
            }
        }

        // P1과 P2의 값이 아직 남아있다.
        while (P1 < n) answer.add(narr[P1++]);
        while (P2 < m) answer.add(marr[P2++]);

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Test01 T = new Test01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] narr = new int[n];
        for (int i =0; i<n; i++) {
            narr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] marr = new int[m];
        for (int i =0; i<m; i++) {
            marr[i] = sc.nextInt();
        }

        for (int a : T.solution(n,m,narr, marr)) {
            System.out.print(a + " ");
        }
    }
}
