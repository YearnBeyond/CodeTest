package SlidingWindow;

import java.io.IOException;
import java.util.Scanner;

//********************************************************
// 최대 길이 연속부분수열

//********************************************************
public class Test06 {
    public int solution(int n, int k, int[] arr){
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt =0; rt<n; rt++){
            if (arr[rt] == 0) {
                cnt++; // 이 지점에서 rt가 0을 1로 바꾼다.
            }
            while (cnt > k){
                if (arr[lt] ==0) { //rt가 0->1로 바꿔놓은 것을 lt가 다시 1->0으로 변경
                    cnt--;
                    lt++;
                }
            }
            answer = Math.max(answer, rt -lt+1); // rt에서 lt까지 '1'인 경우의 길이
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Test06 T = new Test06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,k,arr));

    }
}
