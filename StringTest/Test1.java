package StringTest;

public class Test1 {
    static void main(String[]s) {
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.print(n % (n % 25 > 0 ? 4 : 16) > 0 ? 0 : 1);

        System.out.println(n%4==0&(n%100!=0|n%400==0)?1:0);

        System.out.println(n%4==0&&(n%100!=0|n%400==0)?1:0);
    }
}