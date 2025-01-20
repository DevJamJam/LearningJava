package exercise.chapter_45;

public class PointSituation {
    public static void main(String[] args) {
        Point<Integer,Integer> point1 = new Point(1,5);
        Point<Integer,Double> point2 = new Point(5,4.55);
        Point<Double,Double> point3 = new Point(2.5,10.5);

        System.out.println(point1.calculateDistance());
        System.out.println(point2.calculateDistance());
        System.out.println(point3.calculateDistance());

        /**
         *  결과 :
         *  5.0990195135927845
         *  6.760362416320593
         *  10.793516572461451
         */

//        Point<String ,Double> point4 = new Point("Cat",10.5);
//        System.out.println(point4.calculateDistance()); // null
//        public class Point<T extends Number,V extends Number>  추가 후엔 해당 코드는 오류 발생한다.
    }
}
