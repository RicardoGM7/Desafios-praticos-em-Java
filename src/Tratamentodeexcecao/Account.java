package Tratamentodeexcecao;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        validatewithdraw(amount);
        balance -= amount;
    }

    public void validatewithdraw(double amount) throws BusinessException {
        if (withdrawLimit < amount) {
            throw new BusinessException("Limite de saque superado");
        }
        if (balance < amount) {
            throw new BusinessException("Saldo insuficiente");
        }

    }
}
