package _super.exer1;

public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(){

    }

    public CheckAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public CheckAccount(int id, double balance, double annualInterestRate, int overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=getBalance()){
            //错误的 getBalance是返回的一个常量
//            getBalance() = getBalance() - amount;
            //正确的
            super.withdraw(amount);
        } else if (getBalance()+overdraft>=amount) {
            overdraft -= amount-getBalance();
            super.withdraw(getBalance());//逻辑问题
        }else{
            System.out.println("超过可透支限额" );
        }

    }

}
