package mediator.house;

public interface Mediator {
    void wakeUpMorning();
    void breakTimeEvening();
    void calendarEvent();
    void registers(Alarm alarm, Calendar calendar, CoffeePot coffeePot, Sprinkler sprinkler);
}
