package Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test8 {
    public ArrayList<Integer> solution(int n, String[] str) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
			// 숫자 뒤집기
			int num = Integer.parseInt(new StringBuilder(str[i]).reverse().toString());
			
			// 소수 판별
			if (isPrime(num)) {
                System.out.println(num+"은 소수입니다. 추가하겠습니다.");
				result.add(num); // 소수일 경우 결과 리스트에 추가한다.
			}
		}

        return result;
    }
	
	// 소수 판별 메서드
	private boolean isPrime(int num) {
		if (num < 2) return false; // 1은 소수가 아니다.
		for (int i =2; i<= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

    public static void main(String[] args) throws IOException {
		Test8 T = new Test8();
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (int x: T.solution(n, str)) {
            System.out.print(x+" ");
        }
    }
}
