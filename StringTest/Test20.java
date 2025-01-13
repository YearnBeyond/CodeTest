package StringTest;

import java.io.IOException;
import java.util.Scanner;

//
public class Test20 {
    public char solution(String str) {
		String answer="";
		String temp = "";
		
		for(int i = 0; i<str.length(); i++) {
			if (str.charAt(i) == '#') {
				temp += 1;
			} else if (str.charAt(i) == '*') {
				temp += 0;
			}
		}
		System.out.println(temp);
		
		double result = 0;
		for(int i = 0; i<str.length(); i++) {
			result = result + Character.getNumericValue(temp.charAt(i)) * Math.pow(2, i);
		}
		System.out.println(result);
		char c = (char)result;

		return c;
    }

    public static void main(String[] args) throws IOException {
        Test20 T = new Test20();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));

    }
}
