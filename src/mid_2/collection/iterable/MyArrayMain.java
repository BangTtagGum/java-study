package mid_2.collection.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        //추가
        System.out.println("for-each 사용");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }
    }

}