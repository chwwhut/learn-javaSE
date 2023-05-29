package method;

public class RecusionExer01 {

    //练习1：
    //已知一个数列：f（20） = 1，f（21）=4，f（n+2) = 2*f(n+1)+f(n),
    //其中n是大于0的整数，求f（10）的值

    public int f(int n){
        if(n == 20){
            return 1;
        } else if (n==21) {
            return 4;

        }else{
            return f(n+2) -2* f(n+1);

        }
    }

    //练习2：
    //已知一个数列：f（0） = 1，f（1）=4，f（n+2) = 2*f(n+1)+f(n),
    //其中n是大于0的整数，求f（10）的值

    public int func(int n){
        if(n == 0){
            return 1;
        }else if(n==1){
            return 4;
        }else {
            return 2*func(n-1)+func(n-2);
        }
    }
}
