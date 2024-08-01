package mid_2.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성시점에 T의 타입 결정
        integerBox.setValue(10);
//        integerBRox.setValue("문자"); // Integer만 허용
        Integer value = integerBox.getValue();
        System.out.println("value = " + value);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("문자");
        String value1 = stringBox.getValue();
        System.out.println("value1 = " + value1);

    }
}
