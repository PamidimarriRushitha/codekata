import java.util.Scanner;
public class C
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[2];
      for(int i=0; i<a.length; i++)
    {
      a[i]=sc.nextInt();
    }
    int N=a[0];
    int K=a[1];
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
