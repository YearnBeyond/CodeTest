import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(a,b);
        min = Math.min(min,c);

        if (a == min) System.out.print("1 ");
        else System.out.print("0 ");

        if(a==b && b==c) System.out.println("1");
        else System.out.println("0");

    }
}