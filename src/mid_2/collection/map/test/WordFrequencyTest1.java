package mid_2.collection.map.test;

import java.util.HashMap;
import java.util.StringTokenizer;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        HashMap<String, Integer> fruitCountMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(text);

        while (st.hasMoreTokens()) {
            String fruit = st.nextToken();
            fruitCountMap.put(fruit, fruitCountMap.getOrDefault(fruit, 0) + 1);
        }

        System.out.println(fruitCountMap);

    }
}
