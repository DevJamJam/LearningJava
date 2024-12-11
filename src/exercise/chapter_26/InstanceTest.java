package exercise.chapter_26;

public class InstanceTest {
    public static void main(String[] args){
        // 학생 인스턴스
        Student student1 = new Student();

        student1.name = "Jin";
        student1.gender = "Male";
        student1.schoolName = "BlackSchool";
        student1.classYear = 3;
        student1.classroomNumbers = 5;
        student1.studentNumber = 6;

        System.out.println(student1.name); // Jin
        System.out.println(student1.gender); // Male
        System.out.println(student1.studentNumber); // 6


        Student student2 = new Student();

        student2.name = "Jodi";
        student2.gender = "Female";
        student2.schoolName = "FBISchool";
        student2.classYear = 2;
        student2.classroomNumbers = 5;
        student2.studentNumber = 7;

        System.out.println(student2.name); // Jodi
        System.out.println(student2.gender); // Female
        System.out.println(student2.studentNumber); // 7

        //기본 생성자 확인 하기
        Student student3 = new Student();
        System.out.println(student3.name); // null
        System.out.println(student3.gender); // null
        System.out.println(student3.studentNumber); // 0

        //생성자 오버로딩
        Student student4 = new Student("BlackSchool",1,5,25,"Vervon","Male");
        System.out.println(student4.name); // Vervon
        System.out.println(student4.gender); // Male
        System.out.println(student4.studentNumber); // 25


        Teacher teacher = new Teacher();
        teacher.name = "Rose";
        teacher.gender = "Female";
        teacher.schoolName = "BlackSchool";

        Subject JapaneseSubject = new Subject();
        JapaneseSubject.subjectName = "Japanese";
        JapaneseSubject.subjectCode = "APTX4869";

        teacher.subject = JapaneseSubject;

        System.out.println(teacher.name); // Rose
        System.out.println(teacher.gender); // Female
        System.out.println(teacher.subject.subjectName); // Japanese

        // 생성자 오버로딩
        Teacher sTeacher = new Teacher("Vermouth","Female","English","00ZERO");
        System.out.println(sTeacher.name); // Vermouth
        System.out.println(sTeacher.gender); // Female
        System.out.println(sTeacher.subject.subjectName); // English
        System.out.println(sTeacher.subject.subjectCode); // 00ZERO
    }
}
