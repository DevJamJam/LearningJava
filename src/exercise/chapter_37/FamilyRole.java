package exercise.chapter_37;

public interface FamilyRole extends MotherRole,Wife{
    @Override
    default void sayLoveEveryDay() {
        MotherRole.super.sayLoveEveryDay();
        Wife.super.sayLoveEveryDay();
    }
}
