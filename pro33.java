import java.util.*;
import java.io.*;
class pro33
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
int s=sc.nextInt();
int c=0,in=0;
for(i=0;i<n;i++)
{
 if(a[i]==s)
  {
   c=1;
   in=i;
   break;
  }
 else
   c=0;
}
if(c==1)
System.out.println(in+1);
else
System.out.println("-1");
}
}