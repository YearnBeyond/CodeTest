package Array;



import java.io.IOException;
import java.util.Scanner;

// 보이는 학생
// max 변수를 하나 만들어놓고 값 저장해서 쓰기
public class Test2 {
    public int solution(int n, int[] m){
        int result = 1;
        int max = m[0];

        for (int i = 1; i< n ; i++) {
            if (m[i] > max) {
                result++;
                max = m[i];
//                System.out.println(m[i]+"키의 학생은 앞 학생보다 키가 크다. 벌써 "+result+"명의 학생이나 보이네.");
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Test2 T = new Test2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, m));
    }
}