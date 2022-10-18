package bank;

public class Platinum extends Account{
    public Platinum(String name, String pin, double initBalance) {
        super(name, pin, initBalance, 50000.0,0.5);
    }

    public void checkAccountBalance(){
        System.out.println("Your account type is Platinum\nYour Balance is: Rp." + this.getBalance());
    }
}
