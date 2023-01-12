public class CountTheNumberOfTripleletSum {

    public static void main(String[] args) {
        int a[]={4,7,3,21,6,5,5};
        System.out.println(tripletCount(a,16));
    }

    private static int tripletCount(int[] array,int sum){
        int count=0;
        int arrayLength=array.length;
        for(int i=0;i<arrayLength;i++){
            for(int j=i+1;j<arrayLength;j++){
                for(int k=j+1;k<arrayLength;k++){
                    if(array[i]+array[j]+array[k]==sum){
                        count++;
                    }
                }
            }

        }
        return count;
    }
}
