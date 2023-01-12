import java.util.Arrays;

public class SortArrayOfSquareWithTwoPointer {
    public static void main(String[] args) {
        int array[] ={-10,-3,2,5,6};
        array=sort(array);
        System.out.println(Arrays.toString(array));
    }
    private static int[] sort(int[] array){
        int i=0;
        int j=array.length-1;
        int array2[]=new int[array.length];
        int k=array.length-1;
        while(i<=j){
            if(Math.abs(array[i])<Math.abs(array[j])){
                array2[k]=array[j]*array[j];
                j--;
            }
            else{
                array2[k]=array[i]*array[i];
                i++;
            }
            k--;
        }
        return array2;
    }
}
