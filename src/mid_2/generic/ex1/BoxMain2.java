package mid_2.generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer value = (Integer) integerBox.getValue();
        System.out.println("value = " + value);


    }

}
