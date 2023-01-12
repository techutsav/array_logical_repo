import java.util.Arrays;

public class RotateArrayWithoutNewArray {

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        int k=5;
        int start=0;
        int length=array.length;
        k=k%length;
        reverse(0,length-k-1,array);//rev(p1)
        reverse(length-k,length-1,array);//rev(p2)
        reverse(0,length-1,array);//rev(p1+p1)
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int start,int end,int array[]){
        while(end>start){
            swap(start,end,array);
            start++;
            end--;
        }
    }

    private static void swap(int i,int j,int array[]){
        array[i]=array[i]+array[j];
        array[j]=array[i]-array[j];
        array[i]=array[i]-array[j];
    }
}
