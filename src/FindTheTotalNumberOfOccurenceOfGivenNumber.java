public class FindTheTotalNumberOfOccurenceOfGivenNumber {

    public static void main(String[] args) {
      int[] array= {3, 5, 0, 7, 8, 3, 0};
      System.out.println(findTheTotalNumberOccurences(array,0));
    }

    private static int findTheTotalNumberOccurences(int[] array,int number){
        int count=0;
        for(int a:array){
            if(a==number){
                count++;
            }
        }
        return count;
    }
}
