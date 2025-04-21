package inheritence;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = (Parent) child;
        System.out.println("child.familyName = " + parent.familyName);
    }
}
