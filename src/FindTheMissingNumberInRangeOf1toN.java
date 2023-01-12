import java.util.Scanner;

public class FindTheMissingNumberInRangeOf1toN {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please provide the size of array");
        int arraySize=scanner.nextInt();
        int[] array=new int[arraySize];
        for(int i=0;i<array.length;i++){
            System.out.println("Give the"+i+"th element");
            array[i]=scanner.nextInt();
        }
        System.out.println(findTheMissingNumber(array,arraySize+1));
    }

    private static int findTheMissingNumber(int[] array,int max){
        int sumOf=max*(max+1)/2;
        int arraySum=0;
        for(int i=0;i<array.length;i++){
            arraySum+=array[i];
        }
        return sumOf-arraySum;
    }
}
