package CondingTest;

public class Card {
	private static int serialNumber = 10000;
	private int cardNumber;
	
	Card(){
		serialNumber++;
		cardNumber = serialNumber;
	}

	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	


}
