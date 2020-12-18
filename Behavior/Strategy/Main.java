package Strategy;

public class Main {
    public static void main(String[] args) {

        System.out.println("=====Java Strategy Pattern=====");

        //Up
        Car car1 = new Car(new CarMoveBehavior.UpBehavior());
        car1.move();

        //Down
        Car car2 = new Car(new CarMoveBehavior.DownBehavior());
        car2.move();

        //Left
        Car car3 = new Car(new CarMoveBehavior.LeftBehavior());
        car3.move();

        //Right
        Car car4 = new Car(new CarMoveBehavior.RightBehavior());
        car4.move();

        Car car5 = new Car(new CarMoveBehavior.RightBehavior());
        car5.move();

    }
}
