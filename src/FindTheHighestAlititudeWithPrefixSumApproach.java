/*
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between
points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point
 */

public class FindTheHighestAlititudeWithPrefixSumApproach {

    public static void main(String[] args) {
        //int[] array={-5,1,5,0,-7};
        int[] array={-4,-3,-2,-1,4,3,2};
        int maximumAltitude=findTheHighestAltitude(array);
        System.out.println(maximumAltitude);

    }

    private static int findTheHighestAltitude(int[] array){
        int maximum=array[0]>0?array[0]:0;
        for(int i=1;i<array.length;i++){
            array[i]=array[i-1]+array[i];
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        return maximum;

    }
}
