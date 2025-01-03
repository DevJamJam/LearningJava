package exercise.chapter_37;

public interface Wife {

    void takeCareHusband(Husband husband);
    String getName();
    // default 사용 실습
    default void sayLoveEveryDay(){
        System.out.println("자기 사랑해");
    }

}
