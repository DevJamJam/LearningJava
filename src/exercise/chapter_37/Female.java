package exercise.chapter_37;

public class Female extends FamilyWoman implements FamilyRole,EmployeeRole{
    // 속성
    private int age;
    private String job;

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "와 함께 업무를 하고 있습니다.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Female(String name) {
        this.name = name;
    }
}
