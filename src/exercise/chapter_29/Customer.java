package exercise.chapter_29;

/**
 *  시나리오 참고
 *  손님은 캐셔에게 아메리카노 가격을 물어본다
 *  손님은 자신의 현금에서 돈을 뺀다
 *  손님은 아메리카노를 테이크 아웃으로 주문한다
 *  손님은 아메리카노 커피를 마신다
 *  손님은 기분이 좋아진다.
 *
 *  추가
 *  손님이 라떼의 가격을 물어보고
 *  라떼의 가격을 지불하고 테이크아웃으로 주문해서
 *  라떼를 마신다. 이후 기분이 좋아진다.
 */
public class Customer {
    //속성
    private long cashAmount;
    private String myFeeling;

    //행위
    public void askCoffee(Cashier cashier,String coffeeName) {
        System.out.println("손님 : 커피 " + coffeeName + " 얼마 인가요?");
    }

    public long withDrawCash(long cashAmount) {
        this.cashAmount -= cashAmount;
        return this.cashAmount;
    }

    public void orderCoffee(String coffeeName, boolean isWrappedUp) {
        String coffeeTake;
        if(isWrappedUp) {
            coffeeTake = "가져 가는거";
        } else {
            coffeeTake = "먹고 가는거";
        }
        System.out.println("손님 : 커피 " + coffeeName + "을 주문할게요" +
                " 단, 커피는 " + coffeeTake + "로 부탁드려요.");
    }

    public void drinkCoffee(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("손님 : 나는 커피 " + coffeeName + "를 마신다. ");
    }

    public void upgradeMyFeeling() {
        this.myFeeling = "기분이 아주 좋아졌다. 만족";
    }
    public void downgradeMyFeeling() {
        this.myFeeling = "기분이 아주 나빠졌다. 불만족";
    }

    public void showMyInfo() {
        System.out.printf("손님 : 지금 나의 기분은 %s 하고, 지갑에 남은 돈은 %d 있습니다.\n",
                myFeeling, cashAmount);
    }
    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }
}
