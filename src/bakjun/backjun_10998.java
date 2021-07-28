package bakjun;

import java.util.Scanner;

public class backjun_10998 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //커맨드 알트 엘 자동줄바꿈
        //18라인처럼 보기좋게 작성해야함.

        System.out.println((a + b) % c);
        System.out.println((a % c) + (b % c) % c);
        System.out.println((a * b) % c);
        System.out.println((a % c) * (b % c) % c);
    }

}
