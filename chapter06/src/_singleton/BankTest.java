package _singleton;

public class BankTest {
    public static void main(String[] args) {
        //Bank bank1 = new Bank();私有化构造器不能造对象

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);

    }
}

class Bank{
    private Bank(){
    }
    private static Bank bank = new Bank();

    public static Bank getInstance(){
        return bank;
    }

}
