import java.util.Scanner;

public class scanexample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A 값을 입력해주세요.");

        int a, b;

        a = scanner.nextInt();

        System.out.println("B 값을 입력해주세요.");

        b = scanner.nextInt();

        System.out.println("a + b는 " + (a + b) +"입니다");




    }


}