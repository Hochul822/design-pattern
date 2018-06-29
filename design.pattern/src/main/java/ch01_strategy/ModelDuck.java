package ch01_strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("저는 모형 오리 입니다.");
    }
}
