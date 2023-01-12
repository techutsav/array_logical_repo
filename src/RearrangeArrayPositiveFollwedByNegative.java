import java.util.Arrays;

public class RearrangeArrayPositiveFollwedByNegative {

    public static void main(String[] args) {
        int array[]={-4,-1,1,2,3,4};
        reArrange(array);
        System.out.println(Arrays.toString(array));

    }

    private static void reArrange(int[] array){
        int transvers=0;
        int findPositive=0;
        int findNegative=0;
        int arrayLength=array.length;
        while(transvers<arrayLength){
            if(transvers%2==0){
                if(array[transvers]>=0){
                    findNegative=transvers;
                    findPositive=transvers;
                    while(findNegative<arrayLength){
                        if(array[findNegative]<0){
                            break;
                        }
                        findNegative++;
                        if(findNegative==arrayLength) {
                            return ;
                        }
                    }
                    rotateArray(findPositive,findNegative,array);
                }//if inner
            }//if outer
            else{
                findNegative=transvers;
                findPositive=transvers;
                while(findPositive<arrayLength){
                    if(array[findPositive]>=0){
                        break;
                    }
                    findPositive++;
                    if(findPositive==arrayLength) {
                        return ;
                    }

                }
                rotateArray(findNegative,findPositive,array);
            }
            transvers++;

        }//while
    }

    private static void rotateArray(int start,int end,int array[]){
        int temp=array[start];
        for(int i=start;i<end;i++){
            array[i]=array[i+1];
        }
        array[end]=temp;
    }
}
