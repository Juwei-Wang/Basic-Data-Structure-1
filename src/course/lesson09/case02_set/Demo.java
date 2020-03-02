package course.lesson09.case02_set;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        System.out.println(set);
        set.add("A");
        System.out.println(set);
        set.add("B");
        System.out.println(set);

        System.out.println(set.contains("A"));

        for (String element : set) {
            System.out.println(element);
        }

        HashSet<Point> points = new HashSet<>();
        points.add(new Point(3, 4));
        points.add(new Point(1, 2));
        System.out.println(points);
        points.add(new Point(1, 2));
        System.out.println(points);

        // add(e)
        // hash(e)
        // e.hashCode()



    }
}
