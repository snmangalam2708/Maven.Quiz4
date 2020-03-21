package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {

    private BankAccount bankAccount;
    private Double hoursWorked;
    private Double hourlyWage;
    private Double moneyEarned;
    private Double balance;
    private Double bankBalance;

    public Employee() {

        hourlyWage = 35.0;
        hoursWorked = 0.0;
        balance = 0.0;
        bankBalance = 0.0;
        bankAccount = new BankAccount();
    }

    public Employee(BankAccount bankAccount) {

        this.bankAccount = bankAccount;
        hourlyWage = 35.0;
        hoursWorked = 0.0;
        balance = 0.0;
        bankBalance = 0.0;

    }

    public Employee(BankAccount bankAccount, Double hourlyWage, Double hoursWorked, Double moneyEarned,  Double balance) {

        this.bankAccount = bankAccount;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.moneyEarned = moneyEarned;
        this.balance = balance;
    }

    public BankAccount getBankAccount() {

        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {

        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) throws IllegalArgumentException {

        if (amountToIncreaseBy<0) { throw new IllegalArgumentException(); }

        else
        {
            balance = this.bankAccount.getBalance();
            balance += amountToIncreaseBy;
            bankAccount.setBalance(balance);
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) throws IllegalArgumentException{

        balance = this.bankAccount.getBalance();
        if (amountToDecreaseBy > balance || amountToDecreaseBy < 0) {
            throw new IllegalArgumentException();
        }
        else {
            balance -= amountToDecreaseBy;
            bankAccount.setBalance(balance);
        }
    }

    @Override
    public Double getBalance() {

        return this.bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {

        this.hoursWorked += numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return moneyEarned;
    }
}
