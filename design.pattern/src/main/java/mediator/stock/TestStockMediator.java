package mediator.stock;

public class TestStockMediator {
    public static void main(String[] args) {
        StockMediator nyse = new StockMediator();

        GoldmanSocks broker = new GoldmanSocks(nyse);
        JPMorgan broker2 = new JPMorgan(nyse);

        broker.buyOffer("Microsoft", 100);
        broker.buyOffer("Google", 50);

        broker2.buyOffer("Facebook", 100);
        broker2.buyOffer("Apple", 200);

        nyse.getStockOffering();
    }
}
