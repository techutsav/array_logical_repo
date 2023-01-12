import java.util.Arrays;

public class RotateArrayWithNewArray {

    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int k=7;
        k=k%5;
        System.out.println(Arrays.toString(rotate(array,k)));
    }

    private static int[] rotate(int array[],int k){
        int length=array.length;
        int resultArray[]=new int[length];
        int i=0;
        while(i<length){
            for(int j=length-k;j<length;j++){
                resultArray[i]=array[j];
                i++;
            }
            for(int m=0;m<length-k;m++){
                resultArray[i]=array[m];
               i++;
            }
        }
       return resultArray;
    }
}
