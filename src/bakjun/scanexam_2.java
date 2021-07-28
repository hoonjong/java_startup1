package bakjun;

import java.util.Scanner;

public class scanexam_2 {
    public static void main(String[] args) {

        //Q 대학교이름, 학번, 이름을 입력받고, 입력받은 값을 출력해보세요!

        Scanner scanner = new Scanner(System.in);

        System.out.println("대학교 이름을 입력해주세요");
        String univer_name, name;
        univer_name = scanner.nextLine();

        System.out.println("학번을 입력해주세요");
        int univer_number;
        univer_number = scanner.nextInt();

        System.out.println("이름을 입력해주세요.");
        name = scanner.nextLine();

        System.out.print("입력한 값을 출력합니다."  +"\n" + univer_name + "\n" + univer_number + "\n" + name);

    }


}


