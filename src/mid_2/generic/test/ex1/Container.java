package mid_2.generic.test.ex1;

public class Container<T> {

    private T value;

    public boolean isEmpty() {
        return value == null;
    }

    public T getItem() {
        return value;
    }

    public void setItem(T data1) {
        value = data1;
    }
}
