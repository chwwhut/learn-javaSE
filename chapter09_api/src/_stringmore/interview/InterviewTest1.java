package _stringmore.interview;

/**
 * @author shkstart
 * @create 23:08
 */
public class InterviewTest1 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");

        operate(a, b);

        System.out.println(a + "," + b);//ABx,B           b没变
    }

    public static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);//x=AB
        y = x;//y=AB
        y.append('x');//ABx
    }
}
