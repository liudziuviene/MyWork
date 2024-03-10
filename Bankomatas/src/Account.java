public class Account {
    private String accountNr;
    private double balance;

    private Wallet wallet;


    public Account(String accountNr, double balance, Wallet wallet) {
        this.accountNr = accountNr;
        this.balance = balance;
        this.wallet = wallet;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
