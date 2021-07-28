package Java_theory;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        int  yourPoint;
        String grade;
        System.out.println("당신의 학점을 입력해주세요.");
        Scanner sc = new Scanner(System.in);

        grade = sc.nextLine();

        switch (grade) {
            case "A":
                yourPoint = 90;
                System.out.println("당신의 점수는" + yourPoint);
                break;


            case "B":
                yourPoint = 80;

                break;

            case "C":
                yourPoint = 70;
                System.out.println(yourPoint);
                break;




        }



    }




}
