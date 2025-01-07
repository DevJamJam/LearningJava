package exercise.chapter_43;

public class Staff {
    // 속성
    private int salesAmount;

    // 행위
    public int helpPayment(Customer customer, int price) {
        return customer.calculatePrice(price);
    }

//    상속으로 코드 변경 필요 X
//    public int helpPayment(VipCustomer customer, int price){
//        return customer.calculatePrice(price);
//    }

    public void addSalesAmount(int cash){
        // 판매금액 매출에 추가
        salesAmount += cash;
    }

    public void printSalesAmount(){
        System.out.println("오늘의 최종 매상은 : " + this.salesAmount + "원 입니다.");
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }
}
