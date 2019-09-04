import java.util.Scanner;
public class Ans
{
  public static void main(String args[])
  {
    Scanner sc=new  Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int c=N+M;
    if(c%2==0)
    {
      System.out.println("even");
    }
    else
    {
      System.out.println("odd");
    }
  }
}
