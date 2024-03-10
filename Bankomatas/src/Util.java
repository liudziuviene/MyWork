
import java.util.List;
import java.util.Scanner;

public class Util {
    Scanner input = new Scanner(System.in);

    public void run() {
        boolean depositSupported = true;
        ATM atm = new ATM(scanData(depositSupported), 20000, "Pavadinimas", depositSupported);

        while (true) {
            boolean isCorrect = false;
            System.out.println("Iveskite saskaitos numeri");
            String value = input.nextLine();
            for (Account account : atm.getAccounts()) {
                if(account == null)
                    continue;
                if (value.equalsIgnoreCase(account.getAccountNr())) {
                    isCorrect = true;
                    operations(atm, account);
                }
            }
            if (!isCorrect) {
                System.out.println("Sios saskaitos bankomatas neaptarnauja\n");
            }
        }
    }

    private void operations(ATM atm, Account account) {

        while (true) {
            System.out.println("A - " + Command.A.getDescription() + "\nB - " + Command.B.getDescription() + "\nE - " + Command.E.getDescription());
            String value = input.nextLine();
            try {
                switch (Command.valueOf(value.toUpperCase())) {
                    case A -> showBalance(account);
                    case B -> {
                        try {
                            if (connectCard(account.getWallet())) {
                                choiseOfCommand(atm, account);
                            }
                        }
                        catch (IllegalAccessError ex){
                            atm.removeAccountByValue(account.getAccountNr());
                            System.out.println("\nJus esate uzblokuotas!\n");
                            return;
                        }
                    }
                    case E -> {
                        return;
                    }
                    default -> throw new IllegalArgumentException();
                }
            } catch (Exception ex) {
                System.out.println("Netinkama komanda!\n");
            }
        }
    }

    private boolean connectCard(Wallet wallet) {

        while (true) {
            System.out.println("Iveskite korteles numeri. X - " + Command.X.getDescription());
            String text = input.nextLine();
            if (text.equalsIgnoreCase(String.valueOf(Command.X)))
                return false;
            for (Card c : wallet.getAllcards()) {
                if (c != null && text.equals(c.getAccountNr())) {
                    return pinKodoIvedimas(c);
                }
            }
            System.out.println("Tokio korteles numerio nera!");
        }
    }

    private boolean pinKodoIvedimas(Card card) {

        int numberOfLives = 3;
        System.out.println("Iveskite PIN koda. X - " + Command.X.getDescription());
        while (true) {
            String text = input.nextLine();
            if (text.equalsIgnoreCase(String.valueOf(Command.X)))
                return false;
            int pincode = 0;

            try {
                pincode = Integer.parseInt(text);
            } catch (Exception e) {
                System.out.println("Iveskite tik skaicius!. X - " + Command.X.getDescription());
                continue;
            }

            if (pincode == card.getPin()) {
                System.out.println("PIN kodas teisingas!");
                return true;
            } else {
                --numberOfLives;
                if (numberOfLives == 0) {
                    throw new IllegalAccessError();
                }
                System.out.println("PIN kodas neteisingas! Liko bandymu: " + numberOfLives + ". X - " + Command.X.getDescription());
            }
        }

    }

    private void choiseOfCommand(ATM atm, Account account) {

        while (true) {
            System.out.println("C - " + Command.C.getDescription() + "\nD - " + Command.D.getDescription() + "\nX - " + Command.X.getDescription());
            String inputtedCommand = input.nextLine();
            switch (Command.valueOf(inputtedCommand.toUpperCase())) {
                case C -> withdrawCash(atm, account);
                case D -> depositCash(atm, account);
                case X -> {
                    return;
                }
            }
        }
    }

    private void showBalance(Account account) {
        System.out.println("Likutis: " + account.getBalance());
    }

    private void depositCash(ATM atm, Account account) {
        System.out.println("Iveskite norima ideti pinigu suma. X - " + Command.X.getDescription());
        double value = 0;
        while (true) {
            String string = input.nextLine();

            if (string.equalsIgnoreCase(String.valueOf(Command.X)))
                return;

            try {
                value = Double.parseDouble(string);
                atm.depositCash(account, value);
                showBalance(account);
                break;

            } catch (Exception e) {
                System.out.println("Netinkama suma, iveskite is naujo. X - " + Command.X.getDescription());
            }
        }

    }

    private void withdrawCash(ATM atm, Account account) {
        System.out.println("Iveskite norima issiimti pinigu suma. X - " + Command.X.getDescription());
        double value = 0;
        while (true) {
            String string = input.nextLine();

            if (string.equalsIgnoreCase(String.valueOf(Command.X)))
                return;

            try {
                value = Double.parseDouble(string);
                showCurrency(atm.withdrawCash(account, value));
                showBalance(account);
                break;

            } catch (Exception e) {
                System.out.println("Netinkama suma, iveskite is naujo. X - " + Command.X.getDescription());
            }
        }

    }

    private void showCurrency(List<Integer> banknotai) {
        int[] banknotuReiksmes = {500, 200, 100, 50, 20, 10, 5};
        for (int i = 0; i < banknotuReiksmes.length; i++) {
            if (banknotai.get(i) != 0) {
                System.out.println("Banknoto " + banknotuReiksmes[i] + "$ yra: " + banknotai.get(i));
            }
        }
    }

    private Account[] scanData(boolean depositSupported) {

        Account[] accounts = new Account[4];
        Card card = new Card("123456789", 1234);
        Card card2 = new Card("987654321", 3210);
        Card card3 = new Card("456321789", 4567);

        Wallet wallet = new Wallet();
        wallet.addCard(card);
        wallet.addCard(card2);
        wallet.addCard(card3);

        Account account = new Account("LT47852196", 500.50, wallet);

        accounts[0] = account;

        Card card4 = new Card("1234569", 6789);
        Card card5 = new Card("9876543", 9876);
        Card card6 = new Card("1234", 1234);

        Wallet wallet2 = new Wallet();
        wallet2.addCard(card4);
        wallet2.addCard(card5);
        wallet2.addCard(card6);

        Account account2 = new Account("MAMA", 5000.50, wallet2);

        accounts[1] = account2;
        return accounts;
    }
}
