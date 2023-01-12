import java.util.Arrays;

public class PrefixSumArray {

    public static void main(String[] args) {
        int array[]={5, 4, 1, 2 ,3};
        prefixSum(array);
        System.out.println(Arrays.toString(array));
    }

    private static void prefixSum(int[] array){
        for(int i=1;i<array.length;i++){
            array[i]=array[i-1]+array[i];
        }
    }
}
