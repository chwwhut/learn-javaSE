package _selfdefine.exer1;

import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.save("1001",new User(1,33,"周杰伦"));
        dao.save("1002",new User(2,23,"昆琳"));

        dao.update("1002",new User(3,26,"蔡依林"));
        dao.delete("1002");

        List<User> list = dao.list();
        for(User user:list){
            System.out.println(user);
        }
    }
}
