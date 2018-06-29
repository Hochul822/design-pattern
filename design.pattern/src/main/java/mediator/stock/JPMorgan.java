package mediator.stock;

public class JPMorgan extends Colleague {
    public JPMorgan(Mediator mediator) {
        super(mediator);
        System.out.println("JP Morgan Signup with the stock exchange");
    }
}
