package mid_2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {

        // Map.of()로 반환되는 맵은 불변이다. 추가 삭제 불가능
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);

        // map1.put("A",3); // 에러
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        Map<String, Integer> map3 = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                map3.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(map3);
    }
}
