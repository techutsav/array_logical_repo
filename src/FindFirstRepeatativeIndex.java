public class FindFirstRepeatativeIndex {

    public static void main(String[] args) {
        int[] array={1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeatative(array));
    }

    private static int firstRepeatative(int[] array){
        int repeatative=-1;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return i+1;//since assuming 1 based indexing
                }
            }
        }
        return -1;
    }
}
