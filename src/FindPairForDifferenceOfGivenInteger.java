import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class FindPairForDifferenceOfGivenInteger {

    public static void main(String[] args) {
     int array[]={5,10,15,20,26};
     System.out.println(pairOfGivenDiff(array,10));
    }


    private static boolean pairOfGivenDiff(int array[],int diff){
        boolean isExit=false;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]-array[i]==diff){
                   isExit=true ;
                }
            }
        }
        return isExit;
    }
}
