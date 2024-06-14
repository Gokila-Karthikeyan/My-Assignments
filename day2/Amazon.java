package week3.day2;

public class Amazon extends CanaraBank {

	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Processing cash on delivery payment...");
	}

	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("Processing UPI payment...");
	}

	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Processing card payment...");
	}

	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Processing internet banking payment...");
	}
public static void main(String[] args) {
    Amazon amazon = new Amazon();
    amazon.cashOnDelivery();
    amazon.upiPayments();
    amazon.cardPayments();
    amazon.internetBanking();
    amazon.recordPaymentDetails();
}
}