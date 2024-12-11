package mission;

public class ChuncheonTicket1 {
    public static void main(String[] args) {
        /**
         * Q1) 티켓의 값은 얼마인가?
         * 전문가 4명 (Kim, Park, Lee, Hong)가 제시하는 적정 티켓 값의 평균을 티켓 값으로 최종 책정하려 한다.
         * 각각 제시한 티켓 값 Kim: 3000, Park: 5000, Lee: 2000, Hong: 2000
         */
        int priceKim = 3000;
        int pricePark = 5000;
        int priceLee = 2000;
        int priceHong = 2000;

        int finalTicketPrice = (priceKim + pricePark + priceLee + priceHong) / 4;
        System.out.println(finalTicketPrice);

    }
}
