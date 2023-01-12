import java.util.Scanner;

public class FirstRepeatingValue {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please provide the size of array");
        int[] array=new int[scanner.nextInt()];
        for(int i=0;i<array.length;i++){
            System.out.println("Give the"+i+"th element");
            array[i]=scanner.nextInt();
        }
        System.out.println(findFirstRepeatingValue(array));
    }

    private static int findFirstRepeatingValue(int array[]){
        int repetativeNumber=-1;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    repetativeNumber=array[i];
                }
            }
        }
        return repetativeNumber;
    }
}
