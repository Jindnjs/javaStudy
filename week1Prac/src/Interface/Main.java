package Interface;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Television television = new Television();

        computer.turnOn();
        computer.turnOff();

        television.turnOn();
        television.turnOff();
    }
}
