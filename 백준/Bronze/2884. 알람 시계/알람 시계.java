import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int hour = x;
        int min = y-45;

        if (min<0) {
            min = 60 + min;
            if ((hour - 1) < 0) {
                hour = 23;
            } else {
                hour = x - 1;
            }
        }
        
        System.out.print(hour+" "+ min);
    }
}
