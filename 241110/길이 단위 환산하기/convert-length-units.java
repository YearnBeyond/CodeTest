import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double ft = 30.48;

        Scanner sc =new Scanner(System.in);
        double a = sc.nextDouble();
        double result = a*ft;

        System.out.printf("%.1f",result);
    }
}