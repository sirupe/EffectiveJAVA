package template_method;

public class Main {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();
        
        bolt.playWithOwner();
        kitty.playWithOwner();
    }
}
