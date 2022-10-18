import bank.Account;
import bank.Gold;
import bank.Platinum;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //Here I Created a Super Class named Account
        //The account can save and transfer/taken
        // data
        // Platinum limit = 50 billion rupiahs, will represent to 50,000. Interest = 500rb/month -> 0.5
        // Gold limit = 1 Billion (1,000). Interest = 80rb/month -> 0.08
        // Silver limit = 100 Million. Interest = 10rb/months -> 0.01
        Account akun = new Gold("Yoel Mountanus Sitorus", "345231", 999.9); //Type-casting
        try {
            akun.saveBalance(10.0); //will raise an exception
        }
        catch (Exception e){
            //System.out.println(e);
        }
        akun.checkAccountBalance(); //Overriding
        akun.takeBalance(200.0);
        try {
            akun.saveBalance(900.0); //will raise an exception
        }
        catch (Exception e){
            //System.out.println(e);
        }
        akun.nextMonth();
        akun.takeBalance(809.0);
        akun.nextMonth();
        akun.nextMonth(); // will freeze the account because cant pay the interest

        ArrayList<Platinum> rekeningSultan = new ArrayList<Platinum>();
        rekeningSultan.add(new Platinum("Sultan Yoel", "515151", 49999.0));
        rekeningSultan.add(new Platinum("Yoela Cantika", "123456", 1230.0));
        rekeningSultan.add(new Platinum("Sir Yoel The Great", "000000", 30000.0));
        /*while(true){
            try {
                akun.takeBalance(10.0); //will raise an exception
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
        }*/
        rekeningSultan.get(0).checkAccountBalance();
    }
}
