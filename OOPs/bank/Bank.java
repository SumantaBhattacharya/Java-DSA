package bank;

// Each public class must be in its own file
class Account {
    String name; // default type access modifier
    public String accountNumber;
    public double balance;
    protected String email; // current and sub classes can only 
    private String password; // only accessible to current class only

    // getters and setters are used when the variable is private
    public String getPassword (){// getter
        return this.password;
    }

    public void setPassword(String pass){// setter
        this.password = pass;
    }

    // Constructor
    public Account(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber; 
        this.balance = initialBalance;
    }
    public Account() { // default contructor
        this.name = "unknown";
        this.accountNumber = String.valueOf((int)(10000000 + Math.random() * 90000000));
        this.balance = 0;
    }


}

public class Bank{
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Apna College";
        a1.email = "apnacollege@gmail.com";

        a1.setPassword("apnacollege");
        System.out.println(a1.getPassword());
    }
}