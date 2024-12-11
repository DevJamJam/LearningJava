package exercise.chapter_18;

public class Operator {
    public static void main(String[] args){
        // += , *=
        int myInt = 5;
        myInt *= 10;
        System.out.println(myInt); // 결과 : 50

        //단항 연산자 ++
        int myInt2 = 10;
        myInt2++; // 단항연산자의 위치에 따라 값이 달라진다.
        //앞에 쓰게 되면 먼저 연산하고 출력 , 뒤에 작성하게 되면 구문 지나고 적용
        System.out.println(myInt2); // 결과 11
    }
}
