public class Account {

    public Account(int customerID, String name, String surname, int balance) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    protected int customerID;
    protected String name;
    protected String surname;
    protected int balance;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    void deposit (int amount) {
        if (amount !=0) {
            balance = balance + amount;
        }
    }

    void withdraw (int amount) {
        if (amount !=0) {
            balance = balance - amount;
        }
    }
}



