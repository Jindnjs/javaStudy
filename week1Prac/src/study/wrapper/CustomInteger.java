package study.wrapper;

public class CustomInteger {

    private int value;

    public CustomInteger(){this.value = 0;}
    public CustomInteger(int value) {
        this.value = value;
    }

    public int getValue() {return value;}
    public void setValue(int value) {this.value = value;}

    public void increment() {this.value += 1;}
    public void decrement() {this.value -= 1;}

    public static void main(String[] args) {

    }
}
