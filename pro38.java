import java.util.*;
class pro38
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int max=0,i,j,c;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
c=0;
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
c++;
}
if(c>max)
{
max=c;
System.out.println("  "+a[i]);
}
}
}
}