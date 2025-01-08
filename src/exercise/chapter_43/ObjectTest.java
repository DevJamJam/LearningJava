package exercise.chapter_43;

public class ObjectTest {
    public static void main(String[] args) {
        Customer customer = new Customer("잼잼");
        System.out.println(customer);
        // toString 오버라이딩 전 : exercise.chapter_43.Customer@22f71333
        // toString 오버라이딩 결과 : Customer (customer ID: Customer01 , name = 잼잼 , customerGrade=SILVER, bonusPoint = 0)
    }
}
