package account_class;

/**
 *  @Author Leonardo Marques - 15/08/2026
*/

import account_class.exceptions.AmountException;

public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this(id, name);
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        try {

            if(isNotNegative(amount)) {
                this.balance += amount;
            }

        } catch (AmountException ae) {
            System.out.println(ae.getMessage());
        }

        return getBalance();
    }

    public int debit(int amount) {
        try {

            if(isGreaterThanBalance(amount)){
                this.balance -= amount;
            }

        } catch(AmountException ae) {
            System.out.println(ae.getMessage());
        }

        return getBalance();
    }

    public int transferTo(Account another, int amount) {
        debit(amount);
        another.credit(amount);

        return getBalance();
    }

    @Override
    public String toString() {
        return String.format("Account[id=%s,name=%s,balance=%s]", getID(), getName(), getBalance());
    }

    private final boolean isGreaterThanBalance(int amount) throws AmountException {
        if(amount > this.balance) {
            throw new AmountException("Amount exceeded balance.");
        }

        return true;
    }

    private final boolean isNotNegative(int amount) throws AmountException {
        if (amount <= 0) {
            throw new AmountException("You cannot deposit negative amounts.");
        }

        return true;
    }
}