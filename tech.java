class tech
{
public static void main(String args[])
{
int num=2025;
int n=num;
int l,r;
int digit=0;
while(n!=0)
{
digit++;
n=n/10;
}
if(digit%2==0)
{
num=n;
l=num%(int)Math.pow(10,digit/2);
r=num/(int)Math.pow(10,digit/2);
int sum=(l*l)+(r*r);
if(n==sum*sum)
{
System.out.println("a tech number");
}
else
{
System.out.println("not a tech number");
}
}
}
}
