package exercise.chapter_42;

public class GarbageCollectorTest {
    public static void main(String[] args) throws InterruptedException {

        Customer[] customers = new Customer[100];

        for(int i = 0; i < 100; i++){
            Customer customer = new Customer("씨오");
            customers[i] = customer;
        }
        System.gc(); // GarbageCollector 실행
        /**
         *   JVMs => JVM Actions => Get JVM Information
         *   => Heap Usage Run 실행
         *   System.gc를 하기 전에는 Customer 있었으나,
         *   System.gc 하고 난 이후 Customer 없음
         *   customers array 추가 후 확인했을때는 Customer 존재 !
         */

        for(Customer customer: customers) {
            customer.printMyInfo();
        }

        while(true){
            Thread.sleep(100);
        }
    }

}
