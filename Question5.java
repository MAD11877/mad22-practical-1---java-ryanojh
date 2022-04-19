import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    List<Integer> nList = new ArrayList<Integer>();
    int lowest = Integer.MAX_VALUE;
    int ans = 0;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number: ");
    int number = in.nextInt();
    for (int i = number; i > 0; i--){
      System.out.print("Enter number: ");
      int x = in.nextInt();
      nList.add(x);
      }
    for(int i : nList){
      int count = 0;
      for(int q : nList){
        if (i != q){
          count += 1;
        }
      }
      if (count < lowest){
        lowest = count;
        ans = i;
      }
    }
    System.out.println(ans);  
  }
}
