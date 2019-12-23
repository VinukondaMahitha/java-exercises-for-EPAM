import java.util.*;
import java.io.*;
class pro35
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
int[] a={12,34,13,45,67,89};
int temp,j;
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}}}
System.out.println("First smallest:"+a[0]+"  Second smallest:"+a[1]);
System.out.println("First largest:"+a[a.length-1]+"  Second largest:"+a[a.length-2]);
}
}