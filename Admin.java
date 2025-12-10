import javax.print.DocFlavor.STRING;

class Admin {
    private String adminId;
    private String name;
    public String email;
    private String password;

    public Admin(String adminId, String name, String email, String password) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getAdminID(){
        return adminId;
    }
    public String getPassword() {
     return password; 
 }
    public String getEmail() {
     return email; 
 }

}