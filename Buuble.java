package buuble;
import java.util.*;
public class Buuble {
  public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
       int arr[]=new int[5];
        System.out.println("Enter the elements:");
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=b.nextInt();
       }
        System.out.print("Original Array");
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(" "+arr[i]);
       }
         for(int j=0;j<arr.length-1;j++)
        {
            for(int k=0;k<arr.length-1;k++)
            {
                if(arr[k]>arr[k+1])
                {
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        System.out.println(" ");
        System.out.print("Buuble sort:");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(" "+arr[j]);
        }  }    }
