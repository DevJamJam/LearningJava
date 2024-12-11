package mission;

public class ChuncheonTicket2 {
    public static void main(String[] args){
        /**
         *미션: 새로 오픈하는 박물관 티켓 업무 2
         * 상황
         * - 시립 박물관 오픈기념으로 시청 근무자들에게 박물관 티켓 625장 을 무료로 배포하려고 한다.
         * - 최대 몇 명까지 나눠줄 수 있고, 그 때 몇 장의 티켓이 남는가? (아주 인기가 많을 예정)
         *진행
         * “ChuncheonTicket2”로 자바 클래스 만든다.
         * 이 때, 각각 개인은 ”3＂장의 티켓을 가져간다.
         * ( 몇 명까지 나눠 줄 수 있는지, 남은 티켓은 몇 개 인지 출력 되어야한다.)
         */

        int freeTicket = 625;
        int personTicket = 3;

        int personCount = freeTicket/personTicket;
        int ticketCount = freeTicket%personTicket;

        System.out.println(personCount);
        System.out.println(ticketCount);
        // 총 208명에게 나눠줄 수 있으며 , 1장이 남는다.
    }
}
