import java.util.*;
import java.io.*;
class pro310
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,k=4,j,l=0;
System.out.println("given");
int[] a=new int[4];

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(args[l]+" ");
l++;
}
System.out.print("\n");
}
System.out.println("reversed");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(args[k-1]+" ");
k--;
}
System.out.print("\n");
}
}
}