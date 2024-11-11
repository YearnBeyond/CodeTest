import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //수학
        int a1 = sc.nextInt(); //영어
        int b = sc.nextInt(); //수학
        int b1 = sc.nextInt();

        if(a>b) System.out.println("A");
        else if (b>a) System.out.println("B");
        else {
            if (a1>b1) System.out.println("A");
            else System.out.println("B");
        }
    }
}