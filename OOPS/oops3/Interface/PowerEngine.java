package Interface;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Power Engine is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine is Stopping");
    }
}
