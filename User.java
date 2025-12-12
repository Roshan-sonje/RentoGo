public class User {

    private String name;
    private String contact;
    private String email;
    private String address;
    private String drivingLicense;
    private String password;

    // Relations
    private Booking booking;
    private Payment payment;

    // Constructor
    public User(String name, String contact, String email, String address,
                String drivingLicense, String password) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.drivingLicense = drivingLicense;
        this.password = password;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getDrivingLicense() { return drivingLicense; }
    public void setDrivingLicense(String drivingLicense) { this.drivingLicense = drivingLicense; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Booking getBooking() { return booking; }
    public void setBooking(Booking booking) { this.booking = booking; }

    public Payment getPayment() { return payment; }
    public void setPayment(Payment payment) { this.payment = payment; }
}