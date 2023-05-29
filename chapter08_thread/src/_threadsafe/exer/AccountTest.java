package _threadsafe.exer;

class Account{//账户

    private double balance;//余额 共享数据


    //操作共享数据

    public synchronized void deposit(double amt){//this:是不是唯一的？即为acct,是唯一的。
        if(amt>0){
            balance+=amt;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"存钱1000块，余额为"+balance);
    }

}

class Customer extends Thread{ //多线程，重写run方法

    Account account;

    public Customer(Account acct){
        this.account = acct;
    }

    public Customer(Account account,String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for(int i =0; i<3;i++){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.deposit(1000);
        }
    }
}
public class AccountTest {
    public static void main(String[] args) {

        Account acct = new Account();

        Customer cust1 = new Customer(acct,"甲");
        Customer cust2 = new Customer(acct,"乙");

        cust1.start();
        cust2.start();
    }



}
