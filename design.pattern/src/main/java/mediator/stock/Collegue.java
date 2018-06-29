package mediator.stock;

abstract class Colleague {
    private Mediator mediator;
    private int collCode;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        mediator.addColleague(this);
    }

    public void sellOffer(String stock, int shares) {
        mediator.sellOffer(stock, shares, this.collCode);
    }

    public void buyOffer(String stock, int shares) {
        mediator.buyOffer(stock, shares, this.collCode);
    }

    public void setCollCode(int collCode) {
        this.collCode = collCode;
    }
}
