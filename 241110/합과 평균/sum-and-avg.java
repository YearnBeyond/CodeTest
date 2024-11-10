import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        int result1 = a+b;
        double result2= (double)(a+b)/2;
        System.out.printf("%d %.1f",result1, result2); 
    }
}