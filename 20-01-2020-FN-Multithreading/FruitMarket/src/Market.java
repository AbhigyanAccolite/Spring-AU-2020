import java.util.ArrayList;
import java.util.List;

public class Market {
    static List<Fruit> fruits = new ArrayList<>(100);

    public static void main(String[] args) {
        Thread grape = new Thread(new FarmerProducer(), "grape");
        Thread apple = new Thread(new FarmerProducer(), "apple");
        Thread orange = new Thread(new FarmerProducer(), "orange");
        Thread watermelon = new Thread(new FarmerProducer(), "watermelon");

        Thread grapeConsumer = new Thread(new UserConsumer(), "grapeConsumer");
        Thread appleConsumer = new Thread(new UserConsumer(), "appleConsumer");
        Thread orangeConsumer = new Thread(new UserConsumer(), "orangeConsumer");
        Thread watermelonConsumer = new Thread(new UserConsumer(), "watermelonConsumer");



        grape.start();
        apple.start();
        watermelon.start();
        orange.start();

        grapeConsumer.start();
        appleConsumer.start();
        watermelonConsumer.start();
        orangeConsumer.start();

    }
}