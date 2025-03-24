package Interface;

public class ElectricEngine implements Engine {

    @Override
    public void start(){
        System.out.println("Electric Engine is Starting" + value);
    }

    @Override
    public void stop(){
        System.out.println("Electric Engine is Stoping");
    }
}
