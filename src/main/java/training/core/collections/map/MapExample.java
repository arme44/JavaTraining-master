package training.core.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> map0 = new HashMap<>();
        map0.put(101,"Elton");
        map0.put(102,"Fredy");
        map0.put(202,"Ozzi");
        map0.put(188,"Foo");
        System.out.println(map0);
        System.out.println(map0.get(202));


        Map<KeyMapEntry, String> map1 = new HashMap<>();
        map1.put(new KeyMapEntry(1), "One");
        map1.put(new KeyMapEntry(2), "Two");
        map1.put(new KeyMapEntry(3), "Three");
        System.out.println(map1.size());
    }

}
