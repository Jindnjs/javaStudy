package enumtest;

public class Main {

    //enum의 총 수량

    public static void main(String[] args) {
        System.out.println(E.valueOf("ONE"));
        System.out.println(E.ONE.getValue());

        for(E e: E.values()) {
            System.out.println(e.getValue());
        }

        System.out.println(E.);
    }
}
