package ch03_decorator;

public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀밀크";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
