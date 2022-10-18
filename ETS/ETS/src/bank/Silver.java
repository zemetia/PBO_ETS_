package bank;

public class Silver extends Account{
    public Silver(String name, String pin, double initBalance) {
        super(name, pin, initBalance, 100.0, 0.01);
    }

    public void checkAccountBalance(){
        System.out.println("Your account type is Silver\nYour Balance is: Rp." + this.getBalance());
    }
}
