import java.io.IOException;

public class bakjun_10172 {

    public static void main(String[] args) throws IOException {

        int a = 30, b = 50;
        int c = a + b;
        int hour = 3, min = 5;

        int sum;
        int score1 = 0, score2 =5;
        sum = score1 + score2;

        int keycode;
        keycode = System.in.read();

        System.out.println("숫자를 입력해주세요!" + keycode);

        int totalMonay = (hour * 5) + 50;  // 3 * 5 + 50  = 65


        System.out.println("a = " + a + " 입니다");
        System.out.println("b = " + b + " 입니다");
        System.out.println("a + b = " + c + " 입니다");

        System.out.println("현재시간은 " + hour + " 시 " + min + " 분 입니다." + totalMonay);



    }
}

