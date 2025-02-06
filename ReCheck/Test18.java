package ReCheck;

import java.util.Scanner;

public class Test18 {
    public int solution(int num,int num1, int[] arr) {
        int max = Integer.MIN_VALUE;
        int len = num - num1;

        for (int i =0; i<len ;i++) {
            int k = i;
            int j = 0;
            int tmp = 0;
            while (j <num1) {
                tmp += arr[k++];
                j++;
            }
            max = Math.max(max, tmp);
        }

        return max;
    }

    public static void main(String[] args) {
        Test18 T = new Test18();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();

        int[] arr = new int[num];
        for (int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(num, num1, arr));
    }
}
