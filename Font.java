import java.util.Scanner;
public class Font
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
    int  b=sc.nextInt();
    int  c=sc.nextInt();
    
    if(a<=100000 && b<=100000 && c<=100000)
    {
    if(c*c == a*a+b*b)
    {
      System.out.println("yes");
    }
    else
    {
      System.out.println("no");
    }
    }
  }
}
    
  
