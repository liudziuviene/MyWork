import java.util.ArrayList;
import java.util.List;

public class ATM {
    private Account[] accounts;
    private double balance;
    private String title;
    private boolean depositSupported;

    public ATM(Account[] accounts, double balance, String title, boolean depositSupported) {
        this.accounts = accounts;
        this.balance = balance;
        this.title = title;
        this.depositSupported = depositSupported;
    }

    public ATM() {
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void removeAccountByValue(String number) {
        int i = 0;
        while (accounts[i] != null){
            if(number.equalsIgnoreCase(accounts[i].getAccountNr())){
                removeAccountHelper(i);
                return;
            }
            i++;
        }
    }

    private void removeAccountHelper(int i) {
        while(accounts[i + 1] != null) {
            accounts[i] = accounts[++i];
        }
        accounts[i] = null;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDepositSupported() {
        return depositSupported;
    }

    public List<Integer> withdrawCash(Account account, double amount) {
        if (amount > account.getBalance() || amount < 5 || amount > balance) {
            throw new IllegalArgumentException();
        }

        double leftOver = amount;
        List<Integer> banknotai = new ArrayList<>();
        int[] banknotuReiksmes = {500, 200, 100, 50, 20, 10, 5};

        for (int i = 0; i < banknotuReiksmes.length; i++) {
            banknotai.add((int) leftOver / banknotuReiksmes[i]);
            leftOver = leftOver % banknotuReiksmes[i];
        }

        if (leftOver != 0) {
            throw new IllegalArgumentException();
        }
        account.setBalance(account.getBalance() - amount);
        this.balance -= amount;
        return banknotai;
    }

    public void depositCash(Account account, double amount) {
        if (amount % 5 != 0  || amount < 5) {
            throw new IllegalArgumentException();
        }
        account.setBalance(account.getBalance() + amount);
        this.balance += amount;
    }
}
