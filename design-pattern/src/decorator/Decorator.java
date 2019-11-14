package decorator;

public class Decorator implements IService {
    private IService service;
    
    
    @Override
    public String runSomething() {
        service = new Service();
        return "deco01" + service.runSomething();
    }
}
