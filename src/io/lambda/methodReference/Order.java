package io.lambda.methodReference;

public class Order {

	public enum Side {
		BUY, SELL
	};

	private final int quantity;
	private final String symbol;
	private final double price;
	private final Side side;

	public Order(int quantity, String symbol, double price, Side side) {
		this.quantity = quantity;
		this.symbol = symbol;
		this.side = side;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getSymbol() {
		return symbol;
	}

	public double getPrice() {
		return price;
	}

	public Side getSide() {
		return side;
	}

	@Override
	public String toString() {
		return String.format("%s %d %s at price %.02f", side, quantity, symbol, price);
	}

	public static int compareByQuantity(Order a, Order b) {
		return a.quantity - b.quantity;
	}

	public int compareByPrice(Order a, Order b) {
		return Double.valueOf(a.getPrice()).compareTo(Double.valueOf(b.getPrice()));
	}

	public static int compareByValue(Order a, Order b) {
		Double tradeValueOfA = a.getPrice() * a.getQuantity();
		Double tradeValueOfB = b.getPrice() * b.getQuantity();
		return tradeValueOfA.compareTo(tradeValueOfB);
	}

}
