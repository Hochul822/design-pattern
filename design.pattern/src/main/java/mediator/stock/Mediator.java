package mediator.stock;

public interface Mediator {
    void sellOffer(String stock, int shares, int collCode);
    void buyOffer(String stock, int shares, int collCode);
    void addColleague(Colleague collegue);
}
