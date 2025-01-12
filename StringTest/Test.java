package StringTest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int score[] = new int[n];

        for (int i = 0; i< n; i++) {
            score[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;
        for (int i = 0; i< n; i++) {
            if (score[i] > max) max =score[i];
            sum += score[i];
        }
        System.out.println(sum*100 /max/n);

    }
}
