package twoarray;

public class ArrayExer04 {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{2,3,4,7,11,13,17,19};

        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] +"\t");
        }

        System.out.println();

        array2 = array1; //赋值array2变量等于array1

        for(int i=0; i< array2.length; i++){
            if( i%2 ==0){
                array2[i] = i;
            }
        }

        for (int i =0; i< array1.length; i++){
            System.out.print(array1[i] +"\t");
        }

        System.out.println();

        for (int i =0; i< array2.length; i++){
            System.out.print(array2[i] +"\t");
        }

    }
}
