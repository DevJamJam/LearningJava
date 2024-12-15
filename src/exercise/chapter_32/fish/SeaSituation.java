package exercise.chapter_32.fish;

public class SeaSituation {
    public static void main(String[] args) {
        // 자식 물고기 만들기
        FishChild fishChild = new FishChild();
        /**
         *  결과 :
         *  부모 물고기가 만들어 지고 있습니다.
         *  자식 물고기가 생성되고 있습니다.
         */

        fishChild.setSexual("Male");
        fishChild.setEatable(true);
        fishChild.setLeavingSea("서해");

        fishChild.printMyInfo();

        /**
         *  결과 :
         *  물고기(sexual=Male, havingPoison=false,leavingSea=서해)
         */
        
        //생성자 오버로딩
        FishChild fishChild12 = new FishChild("Female",false,"동해");
        fishChild12.printMyInfo();
        System.out.println("식용 여부 : " + fishChild12.isEatable());
        // 결과 : 물고기(sexual=Female, havingPoison=false,leavingSea=서해)
        // 식용 여부 : false
    }
}
