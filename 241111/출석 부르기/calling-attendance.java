import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
            case 1 :
                System.out.println("John");
                break;
            case 2:
                System.out.println("Tom");
                break;
            case 3:
                System.out.println("Paul");
                break;
            default:
                System.out.println("Vacancy");
                break;
        }
    }
}