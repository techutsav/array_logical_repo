import java.util.Arrays;

public class RequiredPlatformApproach2 {


    public static void main(String[] args) {
        int   arr[] = {900, 940, 950, 1100, 1500, 1800};
        int  dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(platform(arr,dep));

    }

    private static int platform(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int count=0;
        int max=0;

        while(i<arr.length){
            if(arr[i]<=dep[j]){
                count++;
                max=Math.max(max,count);
                i++;
            }
            else if(arr[i]>dep[j]){
                count--;
                j++;
            }
        }
        return max;

    }
}
