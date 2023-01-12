import java.util.Scanner;

public class RangeSumFromArray {

    public static void main(String[] args) {
        int[] array={0,5,1,2,3,4};//we have assign at 0th index because this 1th index based array
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int start=scanner.nextInt();
        System.out.println("Enter the second number");
        int end=scanner.nextInt();
        int sumoFRange=findRangeSum(array,start,end);
        System.out.println("Sum of the range "+sumoFRange);
    }

    private static int[] prefixSum(int[] array){
        int[] prefixSum=new int[array.length];
        prefixSum[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefixSum[i]=prefixSum[i-1]+array[i];
        }
        return prefixSum;
    }
    private static int findRangeSum(int array[],int start,int end){
        int[] prefixSum=prefixSum(array);
        return prefixSum[end]-prefixSum[start-1];
    }
}
