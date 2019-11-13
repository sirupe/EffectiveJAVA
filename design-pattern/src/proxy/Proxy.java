package proxy;

public class Proxy implements IService {
    private IService service;
    @Override
    public String runSomething() {
        this.service = new Service();
        return service.runSomething();
    }
}
