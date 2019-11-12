package adapter;

public class AdapterServiceB {
    private ServiceB serviceB = new ServiceB();
    
    void runService() {
        serviceB.runServiceB();
    }
}
