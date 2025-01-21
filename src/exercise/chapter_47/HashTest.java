package exercise.chapter_47;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

public class HashTest {
    public static String hashString(String input) {
        try {
            // MessageDigest 인스턴스 생성 (해시 알고리즘으로 SHA-256 선택)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Base64로 인코딩하여 해시된 문자열 반환
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String password = "ceohada09151102";
        String hashedPassword = hashString(password);
        System.out.println("패스워드 원본 : " + password);
        System.out.println("패드워드 해시 : " + hashedPassword);
        /**
         *  패스워드 원본 : ceohada09151102
         *  패드워드 해시 : 8a/VzjVHhggdpqtfM/NzrFp1KmzonJp4ZOFZHw4GYF8=
         */

        // Data 검색을 위한 Hash
        long hashCode = Objects.hashCode(password);
        long hashCode2 = Objects.hashCode(2255);
        long hashCode3 = Objects.hashCode(new Customer("포도"));
        long hashCode4 = Objects.hashCode(new VipCustomer("씨오"));
        long hashCode5 = Objects.hashCode(new VipCustomer("쑝하"));

        System.out.println("Objects HashCode : " + hashCode);
        System.out.println("Objects HashCode : " + hashCode2);
        System.out.println("Objects HashCode Customer : " + hashCode3);
        System.out.println("Objects HashCode VipCustomer : " + hashCode4);
        System.out.println("Objects HashCode VipCustomer : " + hashCode5);


        /**
         *  결과 : 고유한 자신의 정수값이 나온다.
         *  Objects HashCode : 79073682
         *  Objects HashCode : 2255
         *  Objects HashCode Customer : 884457408 => 412279454 으로 바뀌어 출력 ( Customer에서 Override 했기 때문)
         *  Objects HashCode VipCustomer : 1845066581 => 81675997 으로 바뀌어 출력 ( VipCustomer에서 Override 했기 때문)
         *  Objects HashCode VipCustomer : 81675998
         */

        Customer customer1 = new Customer("ID1","포도");
        Customer customer2 = new Customer("ID1", "포도");

        long hashCodeCustomer1 = Objects.hashCode(customer1);
        long hashCodeCustomer2 = Objects.hashCode(customer2);
        System.out.println("첫번째 Customer 1 : " + hashCodeCustomer1);
        System.out.println("두번째 Customer 2 : " + hashCodeCustomer2);
        /**
         *  다른객체 임에도 불구하고 값이 같게 출력
         *  첫번째 Customer 1 : 72341
         *  두번째 Customer 2 : 72341
         *  why ? hashCode를 override 하는 과정에서 ID 값을 사용하였고 해당 객체의 ID 값이 같기 때문
         */
    }
}
