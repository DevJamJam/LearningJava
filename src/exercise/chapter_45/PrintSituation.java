package exercise.chapter_45;

public class PrintSituation {

    public static void main(String[] args) {
        /**
         *  Generic : <> 안에는 객체 혹은 참조형 이여야 한다.
         */
        // 1. 기획: String을 출력하는 프린터 만들어주세요~
        GeneralPrint<String> print = new GeneralPrint();
        print.setMaterial("설계도");

        String material = print.getMaterial();
        print.printMyInfo();

        // 2. 기획: Integer을 출력하는 프린터 만들어주세요~
        GeneralPrint<Integer> print2 = new GeneralPrint();
        print2.setMaterial(1235);

        Integer intMaterial = print2.getMaterial();
        print2.printMyInfo();

        // 3. 기획: Boolean을 출력하는 프린터 만들어주세요~
        GeneralPrint<Boolean> print3 = new GeneralPrint();
        print3.setMaterial(true);

        Boolean booleanMaterial = print3.getMaterial();
        print3.printMyInfo();

        // 4. 아무 타입도 지정하지 않았을 경우
        GeneralPrint print4 = new GeneralPrint();
        print4.setMaterial("설계도");

        String meterial4 = (String)print4.getMaterial();
        print4.printMyInfo();
        // 아무 타입도 지정하지 않아도 동작은 한다.
        // 가장 범용적인 범위인 object 타입의 generic으로 동작

    }
}
