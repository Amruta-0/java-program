class NeonNumber
{
public static void main(String args[])
{
int sum=0,n=9;
int square=n*n;
int d;
while(square>0)
{
d=square%10;
sum=sum+d;
square=square/10;
}
if(sum == n)
{
System.out.println(" neon number"+n);
}
else
{
System.out.println(" Not neon number"+n);
}
}
}


  