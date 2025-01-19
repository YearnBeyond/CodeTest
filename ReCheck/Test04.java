package ReCheck;

import java.io.IOException;
import java.util.Scanner;

public class Test04 {
    public int[] solution(String str, char c) {
        int[] resultArr = new int[str.length()];
        int P = 1000;

        for (int i =0; i< str.length(); i++){
            if (str.charAt(i) != c) {
                P++;
                resultArr[i] = P;
            } else {
                P=0;
                resultArr[i] = P;
            }
        }

        P = 1000; // P가 0이면 아래 부분을 안탄다.
        for (int i = str.length() - 1; i>= 0; i--){
            if (str.charAt(i) != c) {
                P++;
                resultArr[i] = Math.min(resultArr[i], P);
            } else {
                P =0;
                //resultArr[i] = P;
            }
        }

        return resultArr;
    }

    public static void main(String[] args) throws IOException {
        Test04 T = new Test04();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for(int x : T.solution(str, c)) {
            System.out.print(x +" ");
        }

    }
}
