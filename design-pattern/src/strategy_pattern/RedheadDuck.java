package strategy_pattern;

public class RedheadDuck extends Duck implements Flyable, Quackable  {
    @Override
    public void display() { System.out.println("빨간머리 오리입니다."); }

    @Override
    public void fly() { System.out.println("오리 날다!!!"); }

    @Override
    public void quack() { System.out.println("Quack Quack"); }
}
