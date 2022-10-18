package bank;

public class Gold extends Account{
    public Gold(String name, String pin, double initBalance) {
        super(name, pin, initBalance, 1000.0, 0.08);
    }

    public void checkAccountBalance(){
        System.out.println("Your account type is Gold\nYour Balance is: Rp." + this.getBalance());
    }
}
