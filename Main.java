import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String rev="";
      char arr[]=s.toCharArray();
      for(int i=arr.length-1;i>=0;i--)
      {
        rev+=arr[i];
      }
      if(s.equals(rev))
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
      
    }
}
