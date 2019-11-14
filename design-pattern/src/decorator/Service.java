package decorator;

public class Service implements IService {
    
    @Override
    public String runSomething() {
        return "decorator";
    }
}
