import java.util.*;
import java.io.*;
class pro34
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];

int sum=0,i;
float avg;
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
System.out.print(" "+(char)a[i]);
}

}
}