package exercise.chapter_31;

// 상속이 제대로 되었는지 확인하기 위한 SeaSituation.java
public class SeaSituation {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setSexual("Male");
        fish1.setLeavingSea("동해");
        fish1.setHavingPoison(false);

        FishChild fish2 = new FishChild();
        fish2.setSexual("Female");
        fish2.setLeavingSea("서해");
        fish2.setHavingPoison(true);

        fish1.printMyInfo();
        fish2.printMyInfo();
        /**
         *  결과 :
         *  물고기(sexual=Male, havingPoison=false,leavingSea=동해)
         *  물고기(sexual=Female, havingPoison=true,leavingSea=서해)
         */
        fish2.digging();
        fish2.setEatable(true);

        System.out.println("eatable: " + fish2.isEatable());
        /**
         *  결과 :
         *  물고기(sexual=Female, havingPoison=true,leavingSea=서해)
         *  가 모래를 파고 있습니다.
         *  eatable: true
         */

        System.out.println("독성여부 : " + fish2.isHavingPoison());
        fish2.becomeDanger();
        System.out.println("독성여부 : " + fish2.isHavingPoison());

        fish1.eat("새우");
        fish2.eat("새우");

        /**
         *  결과 :
         *  독성여부 : true => becomeDanger동작 전
         *  독성여부 : false => becomeDanger동작 후
         *  물고기(sexual=Male, havingPoison=false,leavingSea=동해)
         *  새우를 먹고 있습니다.
         *  물고기(sexual=Female, havingPoison=false,leavingSea=서해)
         *  새우를 맛있게 먹고 있습니다.
         *  => 같은 eat 이지만 override 되어 fish2는 맛있게 먹고 있습니다로 출력
         */
    }
}
