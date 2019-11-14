package singleton;

import java.util.Objects;

public class Singleton {
    static Singleton singletonObject;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (Objects.isNull(singletonObject)) {
            singletonObject = new Singleton();
        }
        
        return singletonObject;
    }
}
