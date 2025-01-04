import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int b1 = b/100;
		int b2 = (b - (100*b1)) / 10;
		int b3 = b - 100*b1 - 10*b2;
		
		int result1 = a * b3;
		int result2 = a * b2;
		int result3 = a * b1;
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(a*b);
	}
}


