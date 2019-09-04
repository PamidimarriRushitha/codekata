import java.util.Scanner;
public class A {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int s=0;
      if(a<=100000)
      {
        s=a*(a+1)/2;
    }
      System.out.println(s);
}
}
