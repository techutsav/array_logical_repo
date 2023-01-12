public class ArrayDivideEqualPrefAndSuf {
    public static void main(String[] args) {
        int[] array={5, 2, 3, 4};
        int[] prefix=prefix(array);
        int[] suffix=suffix(array);
        System.out.println(check(prefix,suffix));

    }

    private static int[] prefix(int[] array){
        int[] prefix=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        return prefix;
    }
    private static int[] suffix(int[] array){
        int[] suffix=new int[array.length];
        suffix[array.length-1]=array[array.length-1];
        for(int i=array.length-2;i>=0;i--){
           suffix[i]=array[i]+suffix[i+1];
        }
        return suffix;
    }

    private static boolean check(int[] prefix,int[] suffix){
        for(int i=0;i<prefix.length-1;i++){
            if(prefix[i]==suffix[i+1]){
                return true;
            }
        }
        return false;
    }
}
