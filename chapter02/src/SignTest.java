public class SignTest {
    public static void main(String[] args){
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i); //10
        System.out.println("i1="+i1); //11
        i = ++i1;
        System.out.print("i="+i); //12
        System.out.println("i1="+i1); //12
        i = i2--;
        System.out.print("i="+i);
        System.out.println("i2="+i2);
        i = --i2;
        System.out.print("i="+i);
        System.out.println("i2="+i2);

    }
}
