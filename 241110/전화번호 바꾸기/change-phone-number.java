import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        int z=sc.nextInt();
        System.out.printf("010-%d-%d",z,y);
    }
}