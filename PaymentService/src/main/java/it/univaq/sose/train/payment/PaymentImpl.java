package it.univaq.sose.train.payment;


public class PaymentImpl implements Payment {

	public boolean checkCardDetails(String firstanme, String lastname, int cvc, String expiryDate, int cardNumber) {
		if ((int) (Math.log10(cvc) + 1) == 3 && (int) (Math.log10(cardNumber) + 1) == 16) {
			return true;
		}
		return false;

	}
}
