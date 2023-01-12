public class FindTheUniqueNumberFromArray {
    public static void main(String[] args) {
        int a[]={21,7,3,21,5,7,5};

        System.out.println(uniqueNumber(a));
    }

    private static int uniqueNumber(int array[]){
        int result=array[0];
        for(int i=0;i<array.length;i++){
            int count=1;
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count==1){
                result=array[i];
                break;
            }
        }
        return result;
    }
}
