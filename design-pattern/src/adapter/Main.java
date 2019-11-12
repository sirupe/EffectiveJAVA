package adapter;

public class Main {
    public static void main(String[] args) {
        AdapterServiceA adapterServiceA = new AdapterServiceA();
        AdapterServiceB adapterServiceB = new AdapterServiceB();
        
        adapterServiceA.runService();
        adapterServiceB.runService();
    }
}
