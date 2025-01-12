package StringTest;

import java.util.Scanner;

public class Test4 {
    public String solution(String str) {
        String answer = "";

        int m= Integer.MIN_VALUE, pos;

        while((pos = str.indexOf(' ')) != -1 ){ // 마지막 단어에는 공백이 없어 루프종료
            String tmp = str.substring(0, pos); // 문자열의 첫번째부터 첫번째 공백까지
            int len = tmp.length();
            if (len > m) { // 여기서 >= 으로 해버리면 동일한 문자열의 크기가 뒤에서 존재하게 되면 그걸로 엎어침
                m = len;
                answer = tmp;
            }
            str = str.substring(1+pos); // str 재지정. 공백부터 마지막 끝까지.... 그러나 마지막 단어는 tmp로 들어가지 못함
        }
        if (str.length() > m) { // indexOf와 substring을 사용할거면 이 마지막 처리를 꼭 해줘야함.
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test4 T = new Test4();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 한줄 입력!!!!
        System.out.println(T.solution(str));
    }
}
