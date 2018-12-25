package strategy_pattern;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void swim() { System.out.println("오리가 수영중 ~~"); }
    public abstract void display();
    public void performQuack() {
        this.quackBehavior.quack();
    }
    public void performFly() {
        this.flyBehavior.fly();
    }
}
