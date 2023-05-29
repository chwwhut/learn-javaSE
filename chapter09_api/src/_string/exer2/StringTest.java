package _string.exer2;

import org.junit.Test;

public class StringTest {
    /*
    * 题目2：将一个字符串进行反转。将字符串中指定部分进行反转。
      比如"abcdefg"反转为"abfedcg"
    * */

    @Test
    public void test1(){
        String s= "abcdefg";
        String s1 = revese(s,2,5);
        String s2 = revese1(s,2,5);

        System.out.println(s1);
        System.out.println(s2);
    }

    /*
     * 方式1：将String转为char[],针对char[]数组进行相应位置的反转，反转以后将char[]转为String
     * */

    public String revese(String str,int fromIndex,int toIndex){
        char[] arr = str.toCharArray();
        for(int i =fromIndex, j =toIndex;i<j;i++,j--){
            char temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }
        return new String(arr);
    }



    public String revese1(String str,int fromIndex,int toIndex){
        //获取str的第1部分
        String finalstr = str.substring(0,fromIndex);

        //拼接上第2部分
        for(int i= toIndex; i>=fromIndex;i--){
            finalstr += str.charAt(i);
        }

        //拼接上第3部分
        finalstr += str.substring(toIndex+1);

        return finalstr;
    }

    /*
    * 题目3：获取一个字符串在另一个字符串中出现的次数。
      比如：获取"ab"在 "abkkcadkabkebfkabkskab" 中出现的次数
    * */
    public int getSubStringCount(String str,String subStr){
        int count = 0;

        if(str.length()>=subStr.length()){
            int index = str.indexOf(subStr);
            while (index>=0){
                count++;

                index = str.indexOf(subStr,index+subStr.length());
            }
        }
        return count;
    }
    @Test
    public void test2(){
        String subStr = "ab";
        String str = "abkkcadkabkebfkabkskab";

        int count = getSubStringCount(str,subStr);
        System.out.println(count);
    }

}
