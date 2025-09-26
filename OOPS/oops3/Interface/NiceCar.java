package Interface;

public class NiceCar {
    private Engine engine;
    // private Media player = new 

    public NiceCar() {
        engine = new ElectricEngine();
        // System.out.print("Engine is electric engine");
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void upgradeEngine(){
        this.engine = new PowerEngine();
    }

    void start() {
        engine.start();
    }
}
