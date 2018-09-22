import java.io.*;
import java.util.*;
  public class ProductEven{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two Integers:");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=a*b;
      if(c%2==0)
      {
      System.out.println("EVEN");
      }
      else
      {
      System.out.println("ODD");
      }
    }
  } 
 
