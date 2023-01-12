import java.util.Scanner;

public class SwapIntegerByTemp {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=scn.nextInt();
        System.out.println("Enter value of b");
        int b=scn.nextInt();
        System.out.println(" Orginal Value of a="+a+" and b="+b);
        int temp=a;
        b=a;
        a=temp;
        System.out.println(" Orginal Value of a="+a+" and b="+b);

    }



}
