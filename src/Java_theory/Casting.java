package Java_theory;

public class Casting {
    public static void main(String[] args) {

        //자동형변환 : 바이트 크기가 작은 데이터형을 큰 데이터형 안에 넣는 행위
        byte byte1 = 4;
        int int1 = 5;


        int1 = byte1;
        //강제형변환 : 바이트 크기가 큰 데이터형을 작은 데이터 안에 넣는 행위
        //byte1 = int1;  --> 에러발생
        byte1 = (byte)int1;   //int를 byte 형태로 만들었음








    }


}
