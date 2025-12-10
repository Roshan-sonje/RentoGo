class Payment{
	private String paymentID;
	private String bookingID;
	private long amount;

	public Payment(String paymentID, String bookingID,long amount){
		super();
		this.paymentID = paymentID;
		this.bookingID = bookingID;
		this.amount = amount;
	}
	public void getPaymentInfo(){
		System.out.println("***** Payment INFO ******");
		System.out.println("PaymentID : "+paymentID);
		System.out.println("BookingID : "+bookingID);
		System.out.println("Amount : "+amount);
	}
	public String getpaymetID(){
		return paymentID;
	}
	public String getbookingID(){
		return bookingID; 
	}
	public long getAmount(){
		return amount;
	}
	
}
class PaymentDriver {
	public static void main(String[] args) {
		Payment payment = new Payment("3333","453",1656);
		payment.getPaymentInfo();
	}
}