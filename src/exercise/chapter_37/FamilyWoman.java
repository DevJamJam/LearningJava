package exercise.chapter_37;

public abstract class FamilyWoman implements FamilyRole{ // 추상 class 사용 실습
    protected String name;

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

}
