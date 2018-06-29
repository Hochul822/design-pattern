package mediator.stock;

public class GoldmanSocks extends Colleague {
    public GoldmanSocks(Mediator mediator) {
        super(mediator);
        System.out.println("Goldman Socks Signup with the stock exchange");
    }
}