package exercise.chapter_45;

// GeneralPrint 코드를 Generic으로 개선
public class GeneralPrint<T> {
    private T material;

    public void printMyInfo(){
        System.out.println(material + "를 출력합니다.");
    }

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return this.material;
    }
}
// 개선 전
//public class GeneralPrint {
//    private Object material;
//
//    public void printMyInfo(){
//        System.out.println(material + "를 출력합니다.");
//    }
//
//    public void setMaterial(Object material){
//        this.material = material;
//    }
//
//    public Object getMaterial(){
//        return this.material;
//    }
//}
