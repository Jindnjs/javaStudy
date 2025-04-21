package Interface;

public class Computer implements ElectroDevice {
    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 끕니다.");
    }
}
