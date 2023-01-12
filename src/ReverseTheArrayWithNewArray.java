import java.util.Arrays;

public class ReverseTheArrayWithNewArray {

    public static void main(String[] args) {
        int[] originalArray={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(originalArray)));
    }


    private static int[] reverseArray(int []a){
        int[] resultArray=new int[a.length];
        int i=a.length-1;
        int j=0;
        while(i>=0){
            resultArray[j]=a[i];
            j++;
            i--;
        }
        return resultArray;
    }
}
