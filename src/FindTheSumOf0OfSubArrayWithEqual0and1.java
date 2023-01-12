
/*
2. Given an integer array arr consisting of 0’s and 1’s only, return the max length of sequence
which contains equal numbers of 0 and 1. If no such subarray exists, print -1
 */

public class FindTheSumOf0OfSubArrayWithEqual0and1 {

    public static void main(String[] args) {
       // int[] array={0,1,1,0,1,1,1};
        int[] array={1,1,1};
        int reuslt=prefix0ConsiderAsMinus1(array);
        reuslt=reuslt==-1?-1:reuslt+1;
        System.out.println(reuslt);
    }


    private static int prefix0ConsiderAsMinus1(int array[]){
        array[0]=array[0]==0?-1:1;
        int maxLength=-1;
        for(int i=1;i<array.length;i++){
            if(array[i]==0){
                array[i]=array[i-1]+-1;
            }
            else
                array[i]=array[i-1]+1;

            if(array[i]==0&& maxLength<i){
                maxLength=i;
            }
        }
       return maxLength;
    }
}
