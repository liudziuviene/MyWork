public class Card {
    private String accountNr;
    private int pin;

    public Card(String accountNr, int pin) {
        this.accountNr = accountNr;
        this.pin = pin;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return accountNr + "   " + pin;
    }
}
