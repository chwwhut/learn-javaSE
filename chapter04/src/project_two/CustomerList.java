package project_two;

/**
 * 内部封装一个Customer[],提供对Customer数据的增删改查操作
 */

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * 构造器，用来初始化customer数组
     * @param totalCustomer:指定数组customer数组的最大空间
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }
    /**
     * 添加指定的客户到数组中
     * @param customer
     * @return 添加是否成功
     */
    public boolean addCustomer(Customer customer){
        if(total>= customers.length)
            return false;
        customers[total++] = customer;
        return true;

    }

    /**
     * 用参数customer替换数组中有index指定的对象
     * @param index 指定所替换的对象在数组中的位置，从0开始
     * @param cust 指定替换的新客户对象
     * @return
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index<0 || index>=total){ //total已经加1了
            //System.out.println("索引无效，无法替换");
            return false;
        }else{
            customers[index] = cust;
            return true;
        }
    }
    public boolean deleteCustomer(int index){
        if(index<0 || index>=total) {
            //System.out.println("索引无效，无法替换");
            return false;
        }else{
            for(int i = index; i < total-1;i++){
                customers[i] = customers[i+1];
            }
            customers[--total] = null;//把最后一位置为null且total应减一
            return true;
        }
    }

    /**
     * 返回数组中记录的所有客户对象
     * @return Customer[]数组中包含了当前所有客户对象，该数组长度与对象个数相同。
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total]; //0到total-1共total个客户对象
        for(int i =0; i<total; i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    public int getTotal(){
        return total;
    }

    public Customer getCustomer(int index){
        if(index<0 || index>=total)
            return null;

        return customers[index];

    }


}
