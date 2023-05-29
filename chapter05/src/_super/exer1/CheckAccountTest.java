package _super.exer1;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount cacc1 = new CheckAccount(1122,20000,0.045,5000);
        cacc1.withdraw(5000);
        System.out.println(cacc1.getBalance());
        System.out.println(cacc1.getOverdraft());

        cacc1.withdraw(18000);
        System.out.println(cacc1.getBalance());
        System.out.println(cacc1.getOverdraft());

    }
}
