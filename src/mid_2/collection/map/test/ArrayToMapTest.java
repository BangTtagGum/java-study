package mid_2.collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayToMapTest {

    public static void main(String[] args) {

        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA",
                "30000"}};


        Map<String, Integer> map = new HashMap<>();
        for (String[] item : productArr) {
            map.put(item[0], Integer.valueOf(item[1]));
        }

        for (Entry<String, Integer> e : map.entrySet()) {
            System.out.println("제품: " + e.getKey() + ", 가격: " + e.getValue());
        }

    }

}
