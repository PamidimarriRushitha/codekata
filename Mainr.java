import java.util.Scanner;
public class Mainr{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      int arr[]=new int[10];
      int temp;
      for(int i=0;i<10;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length-1;i++)
      {
        for(int j=1;j<arr.length;j++)
        {
          if(arr[i]>arr[j])
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
     System.out.println(arr[0]);       
    }
}
