package _super.exer1;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000,0.045);

        account1.withdraw(30000);
        System.out.println(account1.getBalance());

        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println(account1.getBalance());
        System.out.println(account1.getAnnualInterestRate());

    }
}
