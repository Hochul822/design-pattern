package mediator.house;

public class HouseMediator implements Mediator {
    Alarm alarm;
    Calendar calendar;
    CoffeePot coffeePot;
    Sprinkler sprinkler;

    @Override
    public void wakeUpMorning() {
        alarm.onEvent();
        calendar.onEvent();
    }

    @Override
    public void breakTimeEvening() {
        coffeePot.onEvent();
    }

    @Override
    public void calendarEvent() {
        alarm.onEvent();
    }

    @Override
    public void registers(Alarm alarm, Calendar calendar, CoffeePot coffeePot, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.calendar = calendar;
        this.coffeePot = coffeePot;
        this.sprinkler = sprinkler;
    }
}
