package ReCheck;

import java.io.IOException;
import java.util.Scanner;


public class Test11 {
    public int solution(int num, int[] arr) {
		
		int max = Integer.MIN_VALUE;
		for (int x : arr) {
			max = Math.max(x, max);
		}
		
		boolean[] isNotPrime = new boolean[max + 1];
		for (int i =2; i<=num; i++) {
			if (!isNotPrime[i]) {
				for (int j = i*i; j<=num; j++){
					isNotPrime[j] = true;
				}
			}
		}
		
		List<Integer> result = new ArrayList<>();
		for (int x: arr) {
			if (!isNotPrime[x]) {
				result.add(x);
			}
		}
		

        return result;
    }

    public static void main(String[] args) throws IOException {
        Test11 T = new Test11();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		int numArr[] = new int[num];

        for (int i =0; i< num; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int x: T.solution(num, numArr)) {
            System.out.print(x + " ");
        }
    }
}
