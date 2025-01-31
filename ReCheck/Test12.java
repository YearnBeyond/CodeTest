package ReCheck;

import java.io.IOException;
import java.util.Scanner;


public class Test12 {
    public String solution(String str) {
        String result = "";
        int len = str.length()/7;
        System.out.println("len : "+len);
        for (int i=0; i<len; i++) {
            String t =str.substring(0,7).replace("#", "1").replace("*", "0");
            int temp = Integer.parseInt(t, 2);
            result += (char)temp;
            str=str.substring(7);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Test12 T = new Test12();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
