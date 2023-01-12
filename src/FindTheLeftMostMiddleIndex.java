public class FindTheLeftMostMiddleIndex {

    public static void main(String[] args) {
        //int array[]={2,3,-1,8,4};
        int array[]={1,-1,4};
        System.out.println(findTheMiddleMost(array));
    }



    private static void prefixSum(int array[]){
        for(int i=1;i<array.length;i++){
            array[i]=array[i-1]+array[i];
        }

    }

    private static int findTheMiddleMost(int array[]){
        prefixSum(array);
        int totalSum=array[array.length-1];
        for(int i=0;i<array.length;i++){
            if(i==0){
                int prefix=0;
                int suffix=totalSum-array[i];
                if(prefix==suffix) return i;
            }
            else if(i==array.length-1){
                int prefix=array[i-1];
                int suffix=0;
                if(suffix==prefix) return i;
            }
            else{
                int prefix=array[i-1];
                int suffix=totalSum-array[i];
                if(prefix==suffix) return i;
            }
        }
        return -1;
    }
}
