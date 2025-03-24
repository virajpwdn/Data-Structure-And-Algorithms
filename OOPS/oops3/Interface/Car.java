package Interface;

public class Car implements Engine, Media, Brake {
    @Override
    public void start() {
        System.out.println("Car is Starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void push() {
        System.out.println("Brakes are pushed");
    }

    @Override
    public void release() {
        System.out.println("Brakes are realeased");
    }
}
