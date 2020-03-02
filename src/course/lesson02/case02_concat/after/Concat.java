package course.lesson02.case02_concat.after;

import io.zzax.jadeite.console.Console;

import java.util.Random;

public class Concat {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        String result = generateRandom(10_0000);
        long time2 = System.currentTimeMillis();
        Console.println(time2 - time1);
        Console.println(result);
    }
    // "abcdefg" + "1234567"
    // size n,     size m
    // O(n + m)


    //                               n
    public static String generateRandom(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(new Random().nextInt(10));
            builder.append(" ");
            // O(1)
        }
        // O(n)
        // O(n)
        return builder.toString();
    }
}
