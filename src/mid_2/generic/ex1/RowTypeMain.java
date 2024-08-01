package mid_2.generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        integerBox.setValue(10);
        Integer value = (Integer) integerBox.getValue();
        System.out.println("value = " + value);
    }
}
