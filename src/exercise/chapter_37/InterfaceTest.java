package exercise.chapter_37;

public class InterfaceTest {
    public static void main(String[] args) {
        // Female 3개의 역활
        // 아내
        Wife female = new Female("씨오");
        Husband husband = new Male("포도");
        female.sayLoveEveryDay();
        female.takeCareHusband(husband);
        /**
         *  결과
         *  우리 가족 사랑해!
         *  포도 을 케어합니다.
         */

        // 이어서 엄마
        MotherRole femaleMother = (MotherRole) female;
        Baby baby = new Baby("쑝");

        femaleMother.educateBaby(baby);
        femaleMother.sayLoveEveryDay();

        /**
         *  결과 :
         *  쑝 아기를 교육중 입니다.
         *  우리 가족 사랑해!
         */

        // 회사원
        EmployeeRole femaleEmployee = (EmployeeRole) female;
        EmployeeRole togetherEmployee = new Female("하다");
        femaleEmployee.workTogether(togetherEmployee);

        /**
         *  결과 :
         *  하다와 함께 업무를 하고 있습니다.
         */
    }
}
