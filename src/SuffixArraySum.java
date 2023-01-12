import java.util.Arrays;

public class SuffixArraySum {

    public static void main(String[] args) {
        int array[]={5, 4, 1, 2 ,3};
        suffixSum(array);
        System.out.println(Arrays.toString(array));
    }

    private static void suffixSum(int[] array){
        for(int i=array.length-2;i>=0;i--){
            array[i]=array[i]+array[i+1];
        }
    }
}
