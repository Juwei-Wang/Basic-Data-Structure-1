package course.lesson14;

import io.zzax.jadeite.file.FileReader;

public class Demo {
    public static void main(String[] args) {
        FileReader reader = FileReader.on("data.txt");
        for (String line : reader) {
            System.out.println(line);
        }
    }
}
