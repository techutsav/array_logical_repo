public class FindTheSecondLargestNumber {

    public static void main(String[] args) {
        int a[]={21,7,3,21,5,7,5};
        System.out.println(findTheSecondHighest(a));
    }


   private static int findTheSecondHighest(int array[]){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
            if(array[i]<max&&array[i]>smax){
                smax=array[i];
            }

            /*else{
                if(smax<array[i]){
                    smax=array[i];
                }
            }*/
        }
        return smax;
   }
}
