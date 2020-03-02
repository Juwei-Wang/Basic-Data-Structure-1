package course.lesson02.case03_slice.after;

import course.lesson02.case02_concat.after.Concat;
import io.zzax.jadeite.basic.Basic;
import io.zzax.jadeite.console.Console;

import java.util.LinkedList;
import java.util.List;

public class Split {
    public static void main(String[] args) {

        String source = Concat.generateRandom(10_0000);
        Console.println(source);

        long time1 = System.currentTimeMillis();
        List<String> parts = split(source);
        long time2 = System.currentTimeMillis();
        Console.println(time2 - time1);
        Console.println(Basic.toString(parts));

    }

    public static List<String> split(String string) {
        List<String> parts = new LinkedList<String>();
        int start = 0;

        while(true) {
//          int index = string.indexOf(" ");
            int index = string.indexOf(" ", start);
            if (index < 0) {
                break;
            }

//          String part = string.substring(0, index);
            String part = string.substring(start, index);
            parts.add(part);

//          string = string.substring(index + 1);
            start = index + 1;
        }
        return parts;
    }
}
