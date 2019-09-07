import  java.util.Scanner;
public class R
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for(int a=1;a<=n;a++)
    {
      for(int b=1;b<n;b++)
      {
        if(a+b==n)
        {
          ++count;
        }
      }
    }
    System.out.println(count);
  }
}
