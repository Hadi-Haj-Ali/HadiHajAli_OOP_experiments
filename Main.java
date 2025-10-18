public class Main {
    public static void main(String[] args) {
        //RobotDog dog = new Animal();
        Animal dog2 = new RobotDog();
        Rechargeable dog3 = new RobotDog();

        Animal a = new RobotDog("Bolt", 2, 90);
        a.eat();
        a.makeSound();


    }
}