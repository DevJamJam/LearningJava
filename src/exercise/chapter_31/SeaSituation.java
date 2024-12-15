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
         *
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

    }
}
