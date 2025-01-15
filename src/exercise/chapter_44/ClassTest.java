package exercise.chapter_44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Customer customer = new Customer("포도");
        // class를 가져오는 2가지 방법
        Class clazz = customer.getClass();
        Class clazz2 = Customer.class;

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        /**
         *  결과 :
         *  public exercise.chapter_44.Customer(java.lang.String,java.lang.String)
         *  public exercise.chapter_44.Customer(java.lang.String)
         */

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        /**
         *  결과 :
         *  public boolean exercise.chapter_44.Customer.equals(java.lang.Object)
         *  public java.lang.String exercise.chapter_44.Customer.toString()
         *  public int exercise.chapter_44.Customer.calculatePrice(int)
         *  public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
         *  public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
         *  public final void java.lang.Object.wait() throws java.lang.InterruptedException
         *  public native int java.lang.Object.hashCode()
         *  public final native java.lang.Class java.lang.Object.getClass()
         *  public final native void java.lang.Object.notify()
         *  public final native void java.lang.Object.notifyAll()
         */

        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        /**
         *  결과 :
         *  Field는 public의 갯수만 출력하므로 결과 값이 없다.
         *  Customer내 public 필드는 없기 때문 ..
         *  임의로 public 값을 주었을 때
         *  public int exercise.chapter_44.Customer.sn 결과 출력 확인
         *  public 제외값 출력 하고 싶을땐 ?
         *  getDeclaredFields() 사용
         */

        Customer customer1 = (Customer) clazz.getConstructor(String.class).newInstance("포도");
        System.out.println(customer1);
        // Customer (customer ID: Customer02 , name = 포도 , customerGrade=SILVER, bonusPoint = 0)
    }
}
