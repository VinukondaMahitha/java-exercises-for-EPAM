import java.util.*;
import java.io.*;
class pro37
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
int[] a={12,34,12,45,67,89};
int temp,j=0;
int len=a.length;
int[] b=new int[len];
for(i=0;i<len;i++)
{
if(a[i]!=a[i+1] && i<len-1)
	{
	b[j]=a[i];
	j++;	
}
}
System.out.println(b.length);
for(i=0;i<b.length;i++)
{
System.out.println(b[i]);
}
}
}