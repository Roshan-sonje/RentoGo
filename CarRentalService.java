import java.sql.*;
import java.util.Scanner;
class CarRentalService{

    // Signup
    public static void signUp(Scanner sc){
        System.out.println("\n*** Create User Module ***\n");
        System.out.print("Enter your name : ");
        String user = sc.nextLine();
        System.out.print("Enter your contact : ");
        long contact = sc.nextLong();
        System.out.print("Enter your email : ");
        String email = sc.next();
        System.out.print("Enter your address : ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.print("Enter your Driving License : ");
        String license = sc.next();
        System.out.print("Enter your password : ");
        String password = sc.next();

//        JDBC CONNECTION
        String dbUser = "root";
        String dbPass = "roshan";
        String url = "jdbc:mysql://localhost:3306/rentogodb";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url,dbUser,dbPass);
            Statement statement = con.createStatement();


//            "INSERT INTO user VALUES ('Aditya',987643215,'aditya@gmail.com','Pune','DL-12345678974','Aditya@123')"
            int rowsAffected = statement.executeUpdate("INSERT INTO users (name, contact, email, address, license, password) VALUES ('"+user+"',"+contact+",'"+email+"'," +
                                "'"+address+"','"+license+"','"+password+"')");

            String sql = "SELECT name FROM users WHERE contact=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1,contact);
            ResultSet rs = ps.executeQuery();
            String dbName="";
            if(rs.next()){
                dbName = rs.getString("name");
            }

            if(rowsAffected>0){
                System.out.println("Thank you for creating account " + dbName);
            }
            else{
                System.out.println("Data not inserted");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        signUp(sc);
    }
}
