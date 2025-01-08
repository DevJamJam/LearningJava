package exercise.chapter_43;

public class EqualsTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ID01", "잼잼");
        Customer customer2 = customer1;

        Customer customer3 = new Customer("ID01", "잼잼");

        System.out.println(customer1);
        System.out.println(customer3);

        /**
         *  결과 :
         *  Customer (customer ID: ID01 , name = 잼잼 , customerGrade=SILVER, bonusPoint = 0)
         *  Customer (customer ID: ID01 , name = 잼잼 , customerGrade=SILVER, bonusPoint = 0)
         */

        System.out.println(customer1.equals(customer2));
        System.out.println(customer1.equals(customer3));
        /**
         *  결과 :
         *  true
         *  false => equals 오버라이딩 결과 true
         *  ==  equals의 기본원형인 메모리값 비교가 기본 상태이므로
         *  == 으로 비교시엔 false
         */
    }
}
