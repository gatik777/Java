public class Accounts {

    private int number;
    private double balance;
    private String Name;
    private String email;
    private String phone;

    public Accounts(String name, String email, String phone) {
        this(9999, 100.55, phone, email, name);
//  Name = name;
//  this.email = email;
//  this.phone = phone;
    }

    public Accounts() {
        this(56789 , 2.50 , "Default Name" , "Default address", "Default phone");
        System.out.println("Empty Constructor called");

    }


    public Accounts(int number, double balance, String customerName, String email, String phone) {

        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.Name = customerName;
        this.email = email;
        this.phone = phone;

    }

    public void setAccountNumber(int accountNumber) {
        this.number = accountNumber;
        if (accountNumber <= 0) {
            System.out.println("Not Possible");

        }

    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println(balance);
    }

    public void setName(String name) {
        Name = name;
        System.out.println(name);
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println(email);
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println(phoneNumber);
    }

    public int getAccountNumber() {
        return number;

    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    private int phoneNumber;



}
