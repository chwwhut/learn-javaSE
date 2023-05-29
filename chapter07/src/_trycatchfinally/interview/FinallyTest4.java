package _trycatchfinally.interview;

/**
 * @author 尚硅谷-宋红康
 * @create 0:21
 */
public class FinallyTest4 {
    public static void main(String[] args) {
        int result = test(10);
        System.out.println(result);
    }

    //test结束
    // 10

    public static int test(int num) {
        try {
            return num;  //返回的还是这个值，没有加1
        } catch (NumberFormatException e) {
            return num--;
        } finally {
            System.out.println("test结束");
//            return ++num;
            ++num;
        }
    }
}
