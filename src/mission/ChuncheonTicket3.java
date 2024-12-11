package mission;

public class ChuncheonTicket3 {
    public static void main(String[] args){
        /**
         * 미션: 새로 오픈하는 박물관 티켓 업무 3
         * 상황
         * - 시립 박물관은 티켓값 반값 할인을 진행할 예정인데,
         * - 나이가 65세 이상이고, 국적이 ＂한국”이면 반값으로 줄 예정이다.
         * 진행
         * “ChuncheonTicket3”로 자바 클래스 만든다.
         * 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가?
         * Alice(나이: 70, 나라: 미국)
         * Kim (나이: 65, 나라: 한국)
         * Yoo (나이: 42, 나라: 한국)
         * 각각 손님의 반값 적용 여부가 true 또는 false로 출력되어야 한다.
         */

        final int SENIOR_AGE_STANDARD = 65;

        boolean Alice = (70 >= SENIOR_AGE_STANDARD) && ("미국" == "한국");
        boolean Kim = (65 >= SENIOR_AGE_STANDARD) && ("한국" == "한국");
        boolean Yoo = (42 >= SENIOR_AGE_STANDARD) && ("한국" == "한국");

        System.out.println(Alice); // false
        System.out.println(Kim); // true
        System.out.println(Yoo); // false

    }
}

