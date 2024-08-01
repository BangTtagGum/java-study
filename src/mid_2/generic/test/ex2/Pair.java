package mid_2.generic.test.ex2;

public class Pair<F, S> {

    private F first;
    private S second;

    public void setFirst(F item) {
        first = item;
    }

    public void setSecond(S item) {
        second = item;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{first=" + first + ", second=" + second + "}";
    }
}
