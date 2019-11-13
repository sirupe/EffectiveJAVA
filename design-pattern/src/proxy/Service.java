package proxy;

public class Service implements IService {
    @Override
    public String runSomething() {
        return "proxy";
    }
}
