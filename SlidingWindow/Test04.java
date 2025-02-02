package SlidingWindow;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 연속 부분수열 ✨✨✨✨
// 합이 특정숫자 M이 되는 경우는 몇번?
// 투포인터 알고리즘이나 슬라이딩 윈도우 알고리즘은 언뜻보면 O(N^2)인 문제를 O(N)으로 끝내겠다는 의지를 가질때 사용
//********************************************************
public class Test04 {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int sum = 0;
        int lt = 0; // 왼쪽 포인터

        // rt의 이동
        for (int rt = 0; rt< n; rt++) { // 오른쪽 포인터
            sum += arr[rt];  // 더하면 바로 확인해야한다.
            if (sum == m) { // lt부터 rt 까지의 합 (0~rt),, rt는 for문으로 인해 계속 증가한다.
                answer++; // 경우의 수 1 증가
            }
            // lt의 이동
            // lt값을 빼서 m(6)이 나와야한다.
            while (sum >= m) {
                sum -= arr[lt]; // lt에 해당하는 값을 빼고
                lt++; // lt의 위치는 우측으로 이동
                if (sum == m) {
                    answer++; // m이랑 같아지면 경우의 수 1 증가
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Test04 T = new Test04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,arr));

    }
}
