import java.util.Arrays;

public class ReverseArrayWithoutNewArray {

    public static void main(String[] args) {
     int array[]={1,2,3,4,5,6};
        reverseArray(array);
     System.out.println(Arrays.toString(array));

    }

    private static void reverseArray(int array[]){
       int i=0;
       int j=array.length-1;
       while(j>i){
           swapValue(array,i,j);
           i++;
           j--;
       }
    }

    private static void swapValue(int array[],int i,int j){
        array[i]=array[i]+array[j];
        array[j]=array[i]-array[j];
        array[i]=array[i]-array[j];
    }

}
