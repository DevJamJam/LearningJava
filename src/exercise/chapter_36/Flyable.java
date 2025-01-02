package exercise.chapter_36;

public interface Flyable {
    // 속성
    long atmospahereLimit = 486; // 대기권
    // interface에 정의한 필드에는 static / final 정의된 것

    // 인스턴스 default 메소드 실습
    default void fly() {
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    };

    // 인스턴스 static 실숩
    static void printLanding(){
        System.out.println("<경보> 현재 이 사물은 공중에 있습니다.");
    }
}
