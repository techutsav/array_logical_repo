public class PartionSubArrayWithEqualSum {
    public static void main(String[] args) {
        int[] array={5, 2, 3, 4};
        System.out.println(check(array));

    }

    private static boolean check(int array[]){
        int prefix=0;
        int sum=totalSum(array);
        for(int i=0;i<array.length-1;i++){
            prefix=prefix+array[i];
            int suffix=sum-prefix;
            if(prefix==suffix) return true;
        }
        return false;
    }

    private static int totalSum(int array[]){
        int totalSum=0;
        for(int i=0;i<array.length;i++){
            totalSum+=array[i];
        }
        return totalSum;
    }
}
