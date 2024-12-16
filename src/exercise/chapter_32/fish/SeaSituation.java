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

        // 쉐도잉 실습 자식 물고기 !
        FishChild fishChild3 = new FishChild(true,"동동해");
        System.out.println(fishChild3.leavingSea); // 결과 : 동동해
        fishChild3.printMyInfo();
        /**
         *  결과 : 물고기(sexual=null, havingPoison=false,leavingSea=null)
         *  fishChild 내부 생성자의 this는 자식 class의 this를 바라보지만,
         *  fishChild3에서 호출하는 메소드 printMyInfo()의 this는 부모의 this를 바라본다.
         *  이를 쉐도잉 현상 이라고 한다.
         */

        FishChild fishChild4 = new FishChild();
        fishChild4.setLeavingSea("서해");
        fishChild4.setLeavingSeaChild("동해");

        fishChild4.printSea();
        /**
         *  결과 :
         *  물고기(sexual=null, havingPoison=false,leavingSea=서해)
         *  printSea 내부 myInfo()가 부모에 있는 this.leavingSea 를 바라보기 때문에
         *  부모의 바다인 서해로 출력
         *  는 동해 바다 출신이고, 부모 물고기는 서해바다 출신이야.
         *
         *  myInfo() override로 변경 후 보여지는 값
         *  물고기(sexual=null, havingPoison=false,leavingSea=서해)
         *  는 부모물고기,
         *  자식 물고기(eatable=false, leavingSea=null)는 동해 바다 출신이고,
         *  부모 물고기는 서해바다 출신이야.
         */

        /**
         *  타입선언 : 부모, 인스턴스화 : 부모
         *  타입선언 : 부모, 인스턴스화 : 자식
         *  타입선언 : 자식, 인스턴스화 : 자식
         *  타입선언 : 자식, 인스턴스화 : 부모 => 묵시적 변환 X 
         */
        Fish fishs1 = new Fish();
        fishs1.eat("새우");
        Fish fishs2 = new FishChild();
        fishs2.eat("새우");
        FishChild fishs3 = new FishChild();
        fishs3.eat("새우");
        // FishChild fishs4 = new Fish(); 
        // error : 부모클래스는 자식클래스로 선언할 수 없다.

        /**
         *  결과 :
         *  물고기(sexual=null, havingPoison=false,leavingSea=null)
         *  새우를 먹고 있습니다. => 부모의 eat
         *  물고기(sexual=null, havingPoison=false,leavingSea=null)
         *  새우를 맛있게 먹고 있습니다. => 자식의 eat
         *  물고기(sexual=null, havingPoison=false,leavingSea=null)
         *  새우를 맛있게 먹고 있습니다. => 자식의 eat
         */

    }
}
