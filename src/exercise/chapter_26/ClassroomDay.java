package exercise.chapter_26;

public class ClassroomDay {
    public static void main(String[] args) {
        // 인스턴스 생성
        Student s1 = new Student("BlackSchool",3,6,5,"Jin","Male");
        Student s2 = new Student("BlackSchool",3,6,10,"Rose","Female");
        Student s3 = new Student("BlackSchool",3,6,15,"Vermouth","Female");
        Student s4 = new Student("BlackSchool",3,6,20,"Vervon","Male");

        Teacher teacher = new Teacher("Jodi","Female","English","AP4869");

        String subjectName = "영어";

        // 본격적인 로직 흐름 시작
        teacher.teach(s1,subjectName);
        s1.study(teacher,subjectName);

        teacher.teach(s2,subjectName);
        s2.study(teacher,subjectName);

        teacher.teach(s3,subjectName);
        s3.study(teacher,subjectName);

        teacher.teach(s4,subjectName);
        s4.study(teacher,subjectName);

        /**
         * 선생: Jin 학생에게 영어 과목을 가르치고 있습니다.
         * 학생 : 저는 Jodi 선생님에게 영어 과목을 배웁니다.
         * 선생: Rose 학생에게 영어 과목을 가르치고 있습니다.
         * 학생 : 저는 Jodi 선생님에게 영어 과목을 배웁니다.
         * 선생: Vermouth 학생에게 영어 과목을 가르치고 있습니다.
         * 학생 : 저는 Jodi 선생님에게 영어 과목을 배웁니다.
         * 선생: Vervon 학생에게 영어 과목을 가르치고 있습니다.
         * 학생 : 저는 Jodi 선생님에게 영어 과목을 배웁니다.
         */
    }
}
