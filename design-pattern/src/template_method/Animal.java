package template_method;

public abstract class Animal {
    public void playWithOwner() {
        System.out.println("이리온");
        play();
        runSomething();
        System.out.println("잘했어");
    }
    
    abstract void play();
    
    void runSomething() {
        System.out.println("꼬리 흔들기");
    }
}
