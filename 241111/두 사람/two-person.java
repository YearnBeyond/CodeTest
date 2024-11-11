import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char a1 = sc.next().charAt(0);
        int b = sc.nextInt();
        char b1 = sc.next().charAt(0);

        if (a<19 && b<19) System.out.println("0");
        else {
            if(a1=='W' && b1=='W') System.out.println("0");
            else System.out.println("1");
        }
    }
}