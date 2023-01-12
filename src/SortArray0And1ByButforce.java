import java.util.Arrays;

public class SortArray0And1ByButforce {

    public static void main(String[] args) {
       int array[]={ 0,1,1,0,1,1,0};
       sort(array);
       System.out.println(Arrays.toString(array));
    }



    private static void sort(int array[]){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                count++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(i<count){
                array[i]=0;
            }
            else{
                array[i]=1;
            }
        }
    }
}
