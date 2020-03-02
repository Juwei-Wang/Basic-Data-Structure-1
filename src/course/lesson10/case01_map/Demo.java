package course.lesson10.case01_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("2", "A");
        map.put("1", "F");
        System.out.println(map.get("1"));
        map.put("2", "H");
        System.out.println(map.get("2"));

        System.out.println("-----");
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println("-----");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("-----");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
