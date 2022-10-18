package bank;
import java.lang.Exception;

public class Account {
    private String name;
    private String pin;
    private double interest;
    private double limit;
    private int balance;
    private boolean isActive;

    public Account(String name, String pin, double initalBalance, double limit, double interest) {
        this.limit = limit;
        this.interest = interest;
        this.name = name;
        this.pin = pin;
        this.isActive = true;

        try {this.saveBalance(initalBalance);}
        catch (Exception e){
            System.out.println("can't make an initial balance because over the limit, the balance become 0");
            this.balance = 0;
        }
    }


    // === LIMIT ENCAPSULATION ===
    protected void setLimit(double limit){
        this.limit = limit;
    }

    protected double getLimit() {
        return this.limit;
    }
    // === LIMIT ENCAPSULATION ===

    // === LIMIT ENCAPSULATION ===
    protected void setInterest(double interest){
        this.interest = interest;
    }

    protected double getInterest() {
        return this.interest;
    }
    // === LIMIT ENCAPSULATION ===
    public void saveBalance(double amount) throws Exception {
        if(this.balance + amount > this.limit){
            System.out.println("You have reached the limit (Rp."+this.limit+"). You just can save about + Rp."+(this.balance + amount - this.limit));
            throw new Exception("Balance Reach Limit"); //raise an exception
        }
        else this.balance += amount;
    }

    public void saveBalance(int amount) throws Exception { //overriding
        if(this.balance + (double)amount > this.limit){
            System.out.println("You have reached the limit (Rp."+this.limit+"). You just can save about + Rp."+(this.balance + (double)amount - this.limit));
            throw new Exception("Balance Reach Limit");
        }
        else this.balance += (double)amount;
    }

    public void takeBalance(double amount){
        if(this.balance - amount < 0)
            System.out.println("We can't proccess this service because this is exceed your balance");
        else this.balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public void nextMonth(){
        //the month is changing
        if(this.balance < this.interest){
            System.out.println("You can't pay the monthly debt, Your account will be freeze");
            this.isActive = false;
        }
        else this.takeBalance(this.interest);
    }

    public void checkAccountBalance(){
        System.out.println("Your account type is NONE\nYour Balance is: Rp." + this.balance);
    }

}
