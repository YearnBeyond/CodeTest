package TwoPointers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//********************************************************
// 공통원소 구하기 ***
// 투포인터 계산을 하기전에 입력받은 2개의 배열을 우선 오름차순 정렬부터 해야함
//********************************************************
public class Test02 {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1); // 오름차순 정렬
        Arrays.sort(arr2);

        // 투포인터 알고리즘
        int p1 = 0, p2 =0;
        while(p1<n && p2<m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++; // 이미 정렬을 했기 때문에 일치하는 원소 나오면 두개 다 ++ 해줘야한다.
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++; // 일치하지 않는 경우 작은쪽 원소를 ++해서 다음 원소와 비교해야지..
            } else {
                p2++; // 항상 작은 것의 원소를 ++해서 다음 원소와 비교
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Test02 T = new Test02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i =0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i =0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : T.solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }

    }
}
