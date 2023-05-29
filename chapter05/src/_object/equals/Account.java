package _object.equals;

public class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null||getClass()!=obj.getClass())
            return false;
        Account account = (Account) obj;
        return Double.compare(account.balance,balance) == 0;
    }//逻辑？

}
