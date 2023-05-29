package _throw;

public class ThrowTest {
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.regist(-1);

        try {
            s1.regist(10);
            s1.regist(-10);
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }


    }


}
class Student{
    int id;

//    public void regist(int id) {
//        if(id >0 ){
//            this.id = id;
//        }else{
//            System.out.println("输入的id非法");
//            //手动抛出异常类的对象
//            throw new RuntimeException("输入的id非法");
//        }
//    }

    public void regist(int id) throws Exception{
        if(id >0 ){
            this.id = id;
        }else{
//            System.out.println("输入的id非法");
//            //手动抛出异常类的对象
//            throw new RuntimeException("输入的id非法");
//            throw new Exception("输入的id非法");

//            throw new String("输入的id非法");//报错

            throw new BelowZeroException("输入的数据非法");

//            System.out.println("此语句不能被执行");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}