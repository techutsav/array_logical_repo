
/*
1. Given an array of integers of length n, and an integer m, (m < n), divide the array into
 2 subarrays such that 1 part contains m elements and the other part contains the rest of
 the elements. This division has to be done such that the difference between the sum of
 elements of both the sub arrays is the maximum. You have to print the maximum difference
 in the sum possible.
 */


public class FindTheMaxDiffOfTwoSubArrays {

    public static void main(String[] args) {
        int array[]={7, 4, 6, 0, 8,2 };
        //prefix={7,11,17,17,25,27};
        //suffix={27,20,16,10,10,2}
        System.out.println(diffOfTwoSumArray(array));

    }
    private static int diffOfTwoSumArray(int array[]){
        int[] prefixSum=prefixSum(array);
        int totalSum=totalSum(prefixSum);
        int sumDiff=0;
        for(int i=0;i<array.length-1;i++){
            int suffix=totalSum-prefixSum[i];
            int diff=suffix-prefixSum[i];
            if(Math.abs(diff)>sumDiff){
                sumDiff=Math.abs(diff);
            }
        }
      return sumDiff;
    }


    private static int[] prefixSum(int array[]){
        int[] prefixSum=new int[array.length];
        prefixSum[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefixSum[i]=prefixSum[i-1]+array[i];
        }
        return prefixSum;
    }
    private static int totalSum(int prefixSum[]){
        return prefixSum[prefixSum.length-1];
    }





}
