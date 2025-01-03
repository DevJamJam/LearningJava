package exercise.chapter_37;

public class Female implements Wife,MotherRole,EmployeeRole{
    // 속성
    private String name;
    private int age;
    private String job;

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "와 함께 업무를 하고 있습니다.");
    }

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + " 아기를 교육중 입니다.");
    }

    @Override
    public void takeCareHusband(Husband husband) {
        String name = husband.getName();
        System.out.println(name + " 을 케어합니다.");
    }

    @Override
    public void sayLoveEveryDay() {
        System.out.println("우리 가족 사랑해!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Female(String name) {
        this.name = name;
    }
}
