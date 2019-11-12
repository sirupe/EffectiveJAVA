package adapter;

public class AdapterServiceA {
    private ServiceA serviceA = new ServiceA();
    
    void runService() {
        serviceA.runServiceA();
    }
}
