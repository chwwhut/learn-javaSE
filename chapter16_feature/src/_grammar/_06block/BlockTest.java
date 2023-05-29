package _grammar._06block;

import org.junit.Test;

/**
使用"""作为文本块的开始符和结束符，在其中就可以放置多行的字符串，不需要进行任何转义。因此，文本块将提高Java程序的可读性和可写性。
 */

public class BlockTest {
    //对比1：
    @Test
    public void test1() {
        String info = "<html>\n" +
                "  <body>\n" +
                "      <p>Hello, 尚硅谷</p>\n" +
                "  </body>\n" +
                "</html>";
        System.out.println(info);

    }

    @Test
    public void test2() {
        String info = """
                <html>
                  <body>
                      <p>Hello, 尚硅谷</p>
                  </body>
                </html>
                """;
        System.out.println(info);
    }



    //对比2
    @Test
    public void test3() {
        String myJson = "{\n" +
                "    \"name\":\"Song Hongkang\",\n" +
                "    \"gender\":\"男\",\n" +
                "    \"address\":\"www.atguigu.com\"\n" +
                "}";
        System.out.println(myJson);
    }

    @Test
    public void test4() {
        String myJson1 = """
                {
                    "name":"Song Hongkang",
                    "gender":"男",
                    "address":"www.atguigu.com"
                }""";
        System.out.println(myJson1);
    }

    //对比3
    @Test
    public void test5() {
        String query = "SELECT employee_id,last_name,salary,department_id\n" +
                "FROM employees\n" +
                "WHERE department_id IN (40,50,60)\n" +
                "ORDER BY department_id ASC";
        System.out.println(query);
    }


    @Test
    public void test6() {
        String newQuery = """
                        SELECT employee_id,last_name,salary,department_id
                        FROM employees
                        WHERE department_id IN (40,50,60)
                        ORDER BY department_id ASC
                """;
        System.out.println(newQuery);
    }
    /*
    * JDK14新特性：
    *  \:取消换行操作
    *  \s:表示一个空格
    * */
    @Test
    public void test7(){
        String newQuery1 = """
                SELECT id,name,email \
                FROM customers\s\
                WHERE id > 4 \
                ORDER BY email DESC
                """;
        System.out.println(newQuery1);

    }
}
