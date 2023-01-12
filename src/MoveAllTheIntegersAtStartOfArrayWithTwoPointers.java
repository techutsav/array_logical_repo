import java.util.Arrays;

public class MoveAllTheIntegersAtStartOfArrayWithTwoPointers {

    public static void main(String[] args) {
       int array[] ={1,2,3,4,5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int array[]){
        int i=0;
        int j=array.length-1;
        while(i<j){
            if(array[i]%2==1&&array[j]%2==0){
                swap(array,i,j);
                i++;
                j--;
            }
            if(array[i]%2==0){
                i++;
            }
            if(array[j]%2==1){
                j--;
            }
        }
    }
    private static void swap(int array[],int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
