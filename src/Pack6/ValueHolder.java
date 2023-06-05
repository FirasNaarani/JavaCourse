package Pack6;

public class ValueHolder<T> {
    private T value;

    public void getValue() {
        System.out.println("My type is " + value.getClass().getSimpleName() + " and my value is: " + value);
    }

    public void setValue(T value) {
        this.value = value;
    }
}
