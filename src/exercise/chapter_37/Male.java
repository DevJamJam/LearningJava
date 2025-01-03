package exercise.chapter_37;

public class Male implements EmployeeRole,Husband{
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
    public String getName() {
        return this.name;
    }

    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name + " 을 케어합니다.");
    }

    public Male(String name) {
        this.name = name;
    }
}
