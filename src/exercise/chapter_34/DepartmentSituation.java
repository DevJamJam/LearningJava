package exercise.chapter_34;

/**
 *  시나리오
 *  손님은 점원에게 가격으로 결제 요청을 한다
 *  점원은 손님 정보에 기반하여 물품 계산
 *  점원은 자신의 매상에 결제 금액을 추가한다
 *  기다리는 손님이 남아있다면 다시 1을 수행
 *  점원은 최종 매상을 출력한다.
 */
public class DepartmentSituation {
    public static void main(String[] args) {

        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        // 포인트가 쌓이는 것을 보기 위한 단골손님 설정 !
        Customer customer = new VipCustomer("포와르");

        Customer[] customerQueue = {
                new Customer("버본"), new VipCustomer("진"), new Customer("워커"),customer,
                new VipCustomer("베르무트") , new VipCustomer("쉐리"), new Customer("스카치"),customer,
                new Customer("아카이"), new VipCustomer("슈이치"), new Customer("도일"),customer,
                new VipCustomer("하이바라") , new VipCustomer("셜록"), new Customer("아서"),customer,
                new GoldCustomer("골드"), new Customer("코난"), new GoldCustomer("핫토리"), new Customer("카즈하"),
                new GoldCustomer("아무로")
        };

        // 시나리오
        for (Customer customerEach : customerQueue) {
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은 : %d\n", cash);
            staff.addSalesAmount(cash);
        }
        staff.printSalesAmount();
    }
}
