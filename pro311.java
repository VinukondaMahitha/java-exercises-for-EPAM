import java.util.*;
import java.io.*;
class pro311

{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,l=0;

if(args.length==9)
{
System.out.println("given array:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(args[l]+" ");
l++;
}
System.out.print("\n");
}
int max=Integer.parseInt(args[0]);
for(i=0;i<9;i++)
{
if(Integer.parseInt(args[i])>max)
	max=Integer.parseInt(args[i]);
}
System.out.println("biggest number in the given array:"+max);
}
else
{
System.out.println("please enter 9 digits");
}

}
}