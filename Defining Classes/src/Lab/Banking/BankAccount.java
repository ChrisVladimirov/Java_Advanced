package Lab.Banking;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int accountNextId = 1;
    private final int id;
    private double balance;

    BankAccount() {
        this.id = accountNextId;
        accountNextId++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}