import java.util.Scanner;
public class Den
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    
    int r=gcd(N,M);
    System.out.println(r);
  }
public static int gcd(int a, int b)
{
    if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
