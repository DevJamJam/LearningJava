package mission;

public class MovieAge {
    public static void main(String[] args){
        int age = 13;
        //중복 코드 방지를 위해 else if문 사용
        if(age < 0) {
            System.out.println("유아 관람 불가");
        } else if (age < 12) {
            System.out.println("전체 관람가");
        } else if (age < 15) {
            System.out.println("12세이상 관람가");
        } else if (age < 19) {
            System.out.println("15세이상 관람가");
        } else {
            System.out.println("청소년 관람 불가");
        }
    }
}

