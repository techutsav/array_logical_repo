public class FindTheMissingNumberByFrequency {

    public static void main(String[] args) {
        int[] array={504,550,6,55,98,475};
        int num=333;
        int[] frequencyArray=new int[10000];
        for(int a:array){
            frequencyArray[a]=1;
        }
        if(frequencyArray[num]!=0)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
