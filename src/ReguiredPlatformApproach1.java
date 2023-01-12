import java.util.Arrays;

public class ReguiredPlatformApproach1 {


    public static void main(String[] args) {
     int   arr[] = {900, 940, 950, 1100, 1500, 1800};
       int  dep[] = {910, 1200, 1120, 1130, 1900, 2000};
       System.out.println(platform(arr,dep));
    }

    private  static int platform(int arr[],int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(dep));
        int platform=1;
        int i=1;
        int j=0;
        while(i<arr.length){
            if(arr[i]<dep[j]){
                platform++;
            }
            else{
                j++;
            }
            i++;
        }
        return platform;

    }
}
