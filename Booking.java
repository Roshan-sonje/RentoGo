class Booking{
	String bookingId;
	String userEmail;
	Payment payment;

	Booking(String bookingId, String userEmail,Payment payment){
		this.bookingId = bookingId;
		this.userEmail = userEmail;
		this.payment = payment;
	}

	public String getBookingId(){
		return this.bookingId;
	}
	public String getUserEmail(){
		return this.userEmail;
	}
	public void setBookingId(String bookingId){
		this.bookingId = bookingId;
	}
	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}
	public void getBookingInfo(){
		System.out.println("\n*** Booking Info ***\n");
		System.out.println("Booking Id : " + bookingId);
		System.out.println("User Email : " + userEmail);
		payment.getPaymentInfo();
	}
}
