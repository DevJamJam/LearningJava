package exercise.chapter_37;

public interface MotherRole {
    void educateBaby(Baby baby);
    // default 사용 실습
    default void sayLoveEveryDay(){
        System.out.println("우리 아가 사랑해");
    };
}
