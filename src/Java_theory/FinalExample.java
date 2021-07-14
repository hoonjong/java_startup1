package Java_theory;//상수의 대해서


public class FinalExample {
    public static void main(String[] args) {
        final int MAX_SPEED = 5000;
        //MAX_SPEED = 4000; --> 에러발생
        //1. 상수는 값을 변경할 수 없다. 변경시 오류 발생
        //2. 상수는 반드시 선언과 동시에 초기화

        // 상수. 사용하는 이유는?
        int triangleArea = (20 * 10) / 2;
        int rectangleArea = 20 * 10;

        // 다음과 같이 사용했을때 값이 변경되거나, 더 추가될경우 상수를 이용하면 더욱 편리하다.

        final int WIDTH = 20;
        final int HEIGHT = 10;

        triangleArea = WIDTH * HEIGHT;

        //다음과 같은 이유로 상수를 이용한다.


        //리터럴이란?
        //변수 혹은 상수에 저장되는 그 자체의 값을 의미한다.




    }


}
