import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result1 = a*b;
        int result2= a/b;

        System.out.printf("%d * %d = %d",a,b,result1);
        System.out.println();
        System.out.printf("%d / %d = %d",a,b,result2);
    }
}