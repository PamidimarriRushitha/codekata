import java.util.Scanner;
public class C
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int K=sc.nextInt();
    int count=0;
    int arr[]=new int[N];
    for(int i=0; i<arr.length; i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==K)
      {
        ++count;
      }
    }
    System.out.print(count);
  }
}
