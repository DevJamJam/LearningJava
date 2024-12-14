package exercise.chapter_30;

public class StaticTest {
    public static void main(String[] args){

        // 클래스 변수
        int num = Student.getSerialNum();
        String city = Student.getCity();

        System.out.println( "num : " + num + ", city : " + city); // num : 1, city : Dokyo

        Student.setSerialNum(10);
        Student.setCity("Osaka");

        // 5명 만들어 보기
        Student student1 = new Student("Jin","Male");
        Student student2 = new Student("Vervon","Male");
        Student student3 = new Student("Vermouth","Female");
        Student student4 = new Student("Akai","Male");
        Student student5 = new Student("Waker","Male");

        student1.printMyInfo();
        student2.printMyInfo();
        student3.printMyInfo();
        student4.printMyInfo();
        student5.printMyInfo();
        /**
         *  Set 하기 전 결과 값
         *  [Student] StudentId : 1, StudentName: Jin, StudentGender: Male, City: Dokyo
         *  [Student] StudentId : 2, StudentName: Vervon, StudentGender: Male, City: Dokyo
         *  [Student] StudentId : 3, StudentName: Vermouth, StudentGender: Female, City: Dokyo
         *  [Student] StudentId : 4, StudentName: Akai, StudentGender: Male, City: Dokyo
         *  [Student] StudentId : 5, StudentName: Waker, StudentGender: Male, City: Dokyo
         *
         *  Set 이후 결과 값
         *  [Student] StudentId : 10, StudentName: Jin, StudentGender: Male, City: Osaka
         *  [Student] StudentId : 11, StudentName: Vervon, StudentGender: Male, City: Osaka
         *  [Student] StudentId : 12, StudentName: Vermouth, StudentGender: Female, City: Osaka
         *  [Student] StudentId : 13, StudentName: Akai, StudentGender: Male, City: Osaka
         *  [Student] StudentId : 14, StudentName: Waker, StudentGender: Male, City: Osaka
         */
    }
}
