package course.lesson02.case03_slice.after2;

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
        StringSlice stringSlice = new StringSlice(string);

        List<String> parts = new LinkedList<String>();

        while(true) {
//          int index = string.indexOf(" ");
            int index = stringSlice.indexOf(" ");
            if (index < 0) {
                break;
            }

//          String part = string.substring(0, index);
            StringSlice partSlice = stringSlice.slice(0, index);
            parts.add(partSlice.toString());

//          string = string.substring(index + 1);
            stringSlice = stringSlice.slice(index + 1);
        }
        return parts;
    }
}
