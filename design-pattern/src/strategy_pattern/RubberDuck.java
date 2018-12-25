package strategy_pattern;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() { System.out.println("고무인형 오리입니다."); }

    @Override
    public void quack() { System.out.println("ppi ~ ppi ~"); }
}
