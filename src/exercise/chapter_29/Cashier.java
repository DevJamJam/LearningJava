package exercise.chapter_29;

/**
 *  시나리오 참고
 *  아메리카노가 얼마 인지 확인한다.
 *  아메리카노 가격을 답변 해준다.
 *  자신의 매상에 돈을 더한다
 *  아메리카노 주문을 알린다
 *  아메리카노 커피를 포장한다
 *  아메리카노 커피 준비 완료를 알린다
 *  추가 :
 *  라떼가 얼마 인지 확인
 *  라떼 가격 답변
 *  자신의 매상에 돈을 더한다
 *  라떼 주문을 알린다
 *  라떼 포장 한다
 *  라떼 준비 완료를 알린다.
 */
public class Cashier {
    //속성
    private long salesAmount;

    //행위
    public long checkCoffeePrice(String coffeeName){
        long price;
        switch(coffeeName) {
            case "americano": price = 5000; break;
            case "latte":
            case "cappuccino":
                price = 6000; break;
            case "mocha": price = 6500; break;
            default: price = 0; break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, long price) {
        if(price == 0) {
            System.out.println("캐셔 : 죄송합니다 손님 말씀하신 메뉴 : " + coffeeName + "는 저희 매장에 없습니다.");
        }
        System.out.println("캐셔 : 말씀하신 커피 " + coffeeName + "은 가격이 " + price + "원 입니다.");
    }

    public void addAmount(long money) {
        this.salesAmount += money;
    }
    public void sayOrder(String coffeeName) {
        System.out.println("캐셔 : 커피 " + coffeeName + " 주문이 들어왔습니다.");
    }

    public Coffee wrapUpCoffee(Coffee coffee) {
        coffee.beWrappedUp();
        return coffee;
    }
    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("캐셔 : 주문하신 커피 " + coffeeName + "가 준비 완료 되었습니다.");
    }

    // 초기값 설정을 위한 setter
    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
}
