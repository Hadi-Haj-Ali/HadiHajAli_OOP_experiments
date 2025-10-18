import java.awt.*;

public class RobotDog extends Animal implements Rechargeable {

    private int batteryLevel;

    public RobotDog() {

    }


    public RobotDog(String name, int age, int batteryLevel) {
        super(name, age);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void makeSound() {
        System.out.println("Beep! Woof! (Robot Dog Sound)");
    }

    @Override
    public void recharge() {
        this.batteryLevel = 100;
        System.out.println("Battery Level is full -> " + this.batteryLevel+" %");
    }

    @Override
    public void eat() {
        super.eat(); // Call parent version
        System.out.println("RobotDog uses electricity instead of food.");

    }
}
