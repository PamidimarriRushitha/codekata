import java.util.Scanner;
public class Mainp {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int K=sc.nextInt();
      int count=0;
      int arr[]=new int[N];
      for(int i=0;i<N;i++)
      {
       arr[i]=sc.nextInt();
    }
      for(int i=0;i<N;i++)
      {
        if(arr[i]==K)
        {
          ++count;
        }
      }
      if(count>0)
      {
        System.out.println("yes");
      }
      else
      {
        System.out.println("no");
      }
    }
        
      
}
