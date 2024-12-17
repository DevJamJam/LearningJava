package exercise.chapter_29;

/**
 *  customer2는 추가로 코드 익히기 위해 생성
 */
public class CoffeeShopSituation {
    public static void main(String[] args){
        // 미리 인스턴스화
        Customer customer1 = new Customer();
        customer1.setCashAmount(50_000);
        Customer customer2 = new Customer();
        customer2.setCashAmount(30_000);

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        // 로직 시작!
        String coffeeName = "americano";
        String coffeeName2 = "latte";
        boolean isTakeOut = true;

        // americano 주문손님
        customer1.askCoffee(cashier,coffeeName);
        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName, price);

        long cash = customer1.withDrawCash(price);
        customer1.orderCoffee(coffeeName, isTakeOut);
        cashier.addAmount(cash);
        cashier.sayOrder(coffeeName);

        barista.noticeOrder(coffeeName);
        Coffee coffee = barista.makeUpCoffee(coffeeName, 500, 0, 30);
        barista.sayCoffeeReady(coffee);

        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee);
        cashier.sayCoffeeReady(coffeeCompleted);

        customer1.drinkCoffee(coffeeCompleted);
        if(coffeeCompleted.getCoffeeName() == coffeeName &&
                coffeeCompleted.isWrappedUp() == isTakeOut) {
            customer1.upgradeMyFeeling();
        }
        else {
            customer1.downgradeMyFeeling();
        }

        customer1.showMyInfo();

        /**
         *  결과 :
         *  손님 : 커피 americano 얼마 인가요?
         *  캐셔 : 말씀하신 커피 americano은 가격이 5000원 입니다.
         *  손님 : 커피 americano을 주문할게요 단, 커피는 가져 가는거로 부탁드려요.
         *  캐셔 : 커피 americano 주문이 들어왔습니다.
         *  바리스타: 커피 주문 확인 했습니다 커피:americano
         *  바리스타 : 커피 제작이 완료 되었습니다. 커피: americano
         *  캐셔 : 주문하신 커피 americano가 준비 완료 되었습니다.
         *  손님 : 나는 커피 americano를 마신다.
         *  손님 : 지금 나의 기분은 기분이 아주 좋아졌다. 만족 하고, 지갑에 남은 돈은 45000 있습니다.
         */

        //라떼 주문 손님
        customer2.askCoffee(cashier,coffeeName2);
        long price2 = cashier.checkCoffeePrice(coffeeName2);
        cashier.replyCoffeePrice(coffeeName2, price2);

        long cash2 = customer2.withDrawCash(price2);
        customer2.orderCoffee(coffeeName2, isTakeOut);
        cashier.addAmount(cash2);
        cashier.sayOrder(coffeeName2);

        barista.noticeOrder(coffeeName2);
        Coffee latte = barista.makeUpCoffee(coffeeName2, 0, 450, 30);
        barista.sayCoffeeReady(latte);

        Coffee latteCompleted = cashier.wrapUpCoffee(latte);
        cashier.sayCoffeeReady(latteCompleted);

        customer1.drinkCoffee(latteCompleted);
        if(latteCompleted.getCoffeeName() == coffeeName2 &&
                latteCompleted.isWrappedUp() == isTakeOut) {
            customer2.upgradeMyFeeling();
        }
        else {
            customer2.downgradeMyFeeling();
        }
        customer2.showMyInfo();

        /**
         * 손님 : 커피 latte 얼마 인가요?
         * 캐셔 : 말씀하신 커피 latte은 가격이 6000원 입니다.
         * 손님 : 커피 latte을 주문할게요 단, 커피는 가져 가는거로 부탁드려요.
         * 캐셔 : 커피 latte 주문이 들어왔습니다.
         * 바리스타: 커피 주문 확인 했습니다 커피:latte
         * 바리스타 : 커피 제작이 완료 되었습니다. 커피: latte
         * 캐셔 : 주문하신 커피 latte가 준비 완료 되었습니다.
         * 손님 : 나는 커피 latte를 마신다.
         * 손님 : 지금 나의 기분은 기분이 아주 좋아졌다. 만족 하고, 지갑에 남은 돈은 24000 있습니다.
         */
    }
}
