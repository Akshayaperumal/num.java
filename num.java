# num.java
import java.io.*;
import java.util.*;
public class num
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int temp=0;
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
              a[i]=s.nextInt();
               
        }
        Arrays.sort(a);
        System.out.println(a[n-1]);
       
        }
}
