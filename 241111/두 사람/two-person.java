import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int a_year = sc.nextInt();
		char a_sex = sc.next().charAt(0); 
		
		int b_year  = sc.nextInt();
		char b_sex = sc.next().charAt(0);
		
		if( (a_year >=19 && a_sex == 'M') || (b_year >=19 && b_sex == 'M')) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
    }
}