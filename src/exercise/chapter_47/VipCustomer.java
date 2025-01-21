package exercise.chapter_47;

import java.util.Objects;

public class VipCustomer extends Customer {
    // 속성
    static int serialNums = 1;

    private String agentID; // vip 담당 직원
    private double discountRatio; // 구매 할인율

    // 행위
    @Override
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent(){
        System.out.println("담당직원 " + agentID + "님 여기 확인 부탁드립니다.");
    }

    public VipCustomer(String name){
        super();
        if(serialNums < 10) {
            this.customerID = "VIP0" + serialNums++;
        } else {
            this.customerID = "VIP" + serialNums++;
        }
        this.customerName = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        // setter 추가 하여 나중에 불러오는 것으로
        this.agentID = agentID;
    }

    @Override
    void printMyInfo(){
        System.out.print("VIP");
        super.printMyInfo();
    }

    // 해시코드 오버라이딩
    @Override
    public int hashCode() {
        return Objects.hash(this.customerID);
    }
}
