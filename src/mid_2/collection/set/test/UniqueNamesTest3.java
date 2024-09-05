package mid_2.collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        // 코드 작성
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 10, 10, 20));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}