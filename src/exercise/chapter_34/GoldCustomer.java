package exercise.chapter_34;

/**
 *  시나리오
 *  생성 시 등급은 GOLD
 *  ID 는 Customer+ 숫자 순차 생성을 따라간다.
 *  구매 할인율 0.03%
 */
public class GoldCustomer extends Customer{

    private double discountRatio;

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    // 생성자
    GoldCustomer(String name) {
        super();
        if(Customer.serialNums < 10) {
            this.customerID = "Customer0" + Customer.serialNums++;
        } else {
            this.customerID = "Customer" + Customer.serialNums++;
        }
        this.customerName = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.03;
        this.discountRatio = 0.03;
    }

    @Override
    void printMyInfo(){
        System.out.print("GOLD");
        super.printMyInfo();
    }
}
