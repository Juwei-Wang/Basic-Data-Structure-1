package course.lesson02.case01_list;

import io.zzax.jadeite.basic.Basic;
import io.zzax.jadeite.console.Console;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        {
            List<Integer> lists = new LinkedList<>();
            lists.add(6);
            lists.add(7);
            lists.add(3);
            Console.println(Basic.toString(lists));
        }
        {
            LinkedList<Integer> lists = new LinkedList<>();
            lists.add(6);
            lists.add(7);
            lists.add(3);
            lists.addFirst(2);
            lists.addLast(8);
            Console.println(Basic.toString(lists));
        }

    }
}
