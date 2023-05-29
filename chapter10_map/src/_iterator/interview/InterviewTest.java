package _iterator.interview;

import org.junit.Test;

/**
 * 笔试题：写出如下程序的输出结果
 *
 */
public class InterviewTest {
    @Test
    public void testFor() {
        String[] arr1 = new String[]{"AA", "CC", "DD"};

        //赋值操作1
//        for(int i = 0;i < arr1.length;i++){
//            arr1[i] = "MM";
//        } //MM MM MM

        //赋值操作2
        for (String s : arr1) {
            s = "MM";
        }//s是临时变量，增强for循环的执行过程中，是将集合或数组中的元素依次赋值给临时变量


        //遍历
        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
