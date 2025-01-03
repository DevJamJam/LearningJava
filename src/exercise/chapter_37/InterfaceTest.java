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
         *  우리 아가 사랑해 (default실습결과)
         *  자기 사랑해 (default실습결과)
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
        EmployeeRole femaleEmployeeTwo = new FemaleTwo("나나");
        femaleEmployee.workTogether(femaleEmployeeTwo);

        /**
         *  결과 :
         *  나나와 함께 업무를 하고 있습니다.
         */
    }
}
