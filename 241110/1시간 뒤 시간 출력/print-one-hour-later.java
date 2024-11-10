import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int h1= h+1;

        System.out.println(h1+":"+m);
    }
}