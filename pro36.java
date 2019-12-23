import java.util.*;
import java.io.*;
class pro36
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
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}