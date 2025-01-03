package exercise.chapter_37;

public class FemaleTwo extends FamilyWoman implements FamilyRole,EmployeeRole{
    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "와 함께 업무를 하고 있습니다.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public FemaleTwo(String name) {
        this.name = name;
    }
}
