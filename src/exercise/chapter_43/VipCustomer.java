package exercise.chapter_43;

/**
 *  시나리오
 *  생성시 등급 VIP
 *  포인트 비율 0.05
 *  구매할인율 적용 된다
 *  고객 ID = VIP + 숫자
 *  추가 구현 고객 ID 가 10 미만일 때 0을 붙여서 출력 될 수 있도록 진행 해보기
 */
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
}
