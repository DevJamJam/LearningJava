package exercise.chapter_26;

public class Student {
    // 속성
    String schoolName;
    int classYear;
    int classroomNumbers;
    int studentNumber;

    // 기본 정보
    String name;
    String gender;

    // 행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("학생 : 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName,subjectName);
    }

    // 생성자
    Student() {
    }
    Student(String pSchoolName,int pClassYear,int pClassroomNum,int pStudentNum, String pName, String pGender) {
        schoolName = pSchoolName;
        classYear = pClassYear;
        classroomNumbers = pClassroomNum;
        studentNumber = pStudentNum;
        name = pName;
        gender = pGender;
    }

}
