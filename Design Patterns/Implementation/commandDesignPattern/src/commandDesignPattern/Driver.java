package commandDesignPattern;

public class Driver {
	public static void main(String[] args) {
		Stock stock=new Stock();
		Order buy=new BuyStock(stock);
		Order sell=new SellStock(stock);
		Broker broker=new Broker();
		broker.takeOrder(buy);
		broker.takeOrder(sell);
		broker.placeOrders();
	}
}
