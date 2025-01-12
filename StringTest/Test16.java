package StringTest;

import java.io.IOException;
import java.util.Scanner;

// 가장 짧은 문자거리 : 왼쪽부터 비교, 오른쪽부터 비교
public class Test16 {
    public int[] solution(String str, String str1) {
        char c = str1.charAt(0);
        int[] resultArray = new int[str.length()];
        int P = 1000;

        for (int i = 0; i< str.length(); i++) {
            if (str.charAt(i) != c) {
                P++;
                resultArray[i] = P;
            } else {
                P=0;
                resultArray[i] = P;
            }
        }
        P =1000; // 다시 초기화하고 for loop 돌려야함.

        // 이 부분이 어렵네
        for (int i = str.length() -1 ; i >=0; i--) { // i가 0보다 클때까지
            if (str.charAt(i) != c) {
                P++;
                resultArray[i] = Math.min(resultArray[i], P); // 최소값을 바로 구할 수 있음
//                if (resultArray[i] > P) {
//                    resultArray[i] = P;
//                }
            } else {
                P=0;
               // resultArray[i] = P;   // 필요없음 어차피 0으로 되어있음
            }
        }
        return resultArray;
    }

    public static void main(String[] args) throws IOException {
        Test16 T = new Test16();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1= sc.next();
        for (int a : T.solution(str, str1)) {
            System.out.print(a+" ");
        }
    }
}
