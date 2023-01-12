import java.util.Scanner;

public class SwapIntegerWithoutTemp {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=scn.nextInt();
        System.out.println("Enter value of b");
        int b=scn.nextInt();
        System.out.println(" Orginal Value of a="+a+" and b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" Orginal Value of a="+a+" and b="+b);

    }
}
