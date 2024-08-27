package mid_2.collection.list.test.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = new ArrayList<>();

        System.out.println("n개의 정수 입력 (종료 0)");
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + (double) total / numbers.size());

    }
}
