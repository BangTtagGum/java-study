package mid_2.collection.list.test.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

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

        System.out.println("출력");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            sb.append(numbers.get(i));
            if(i < numbers.size() - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb);
    }
}
