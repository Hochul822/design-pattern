package mediator.stock;

import java.util.ArrayList;

public class StockMediator implements Mediator {

    ArrayList<Colleague> collegues;
    ArrayList<StockOffer> stockBuyOffers;
    ArrayList<StockOffer> stockSalesOffers;

    private int collegueCodes = 0;

    public StockMediator() {
        this.collegues = new ArrayList<>();
        this.stockBuyOffers = new ArrayList<>();
        this.stockSalesOffers = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague newCollegue) {
        collegues.add(newCollegue);
        collegueCodes++;
        newCollegue.setCollCode(collegueCodes);
    }

    @Override
    public void sellOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;

        for(StockOffer offer : stockSalesOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock +
                                " sold to " + offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if (stockSold) {
                break;
            }
        }

        if (!stockSold) {
            System.out.println(shares + " shares of " + stock +
                            " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockSalesOffers.add(newOffering);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false;

        for(StockOffer offer : stockBuyOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock +
                        " bought to " + offer.getColleagueCode());
                stockSalesOffers.remove(offer);
                stockBought = true;
            }

            if (stockBought) {
                break;
            }
        }

        if(!stockBought) {
            System.out.println(shares + " shares of " + stock +
                    " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockBuyOffers.add(newOffering);
        }
    }

    public void getStockOffering() {
        System.out.println("\nStock for Sales");
        for(StockOffer offer: stockSalesOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }
        System.out.println("\nStock Buy Offers");
        for(StockOffer offer: stockBuyOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }
    }
}
