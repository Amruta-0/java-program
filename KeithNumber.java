class KeithNumber
{
public static void main(String args[])
{
int n=19,cp,rev=0,r;
cp=n;
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
if(cp==0)
{
System.out.println("keith number"+n);
}
else
{
System.out.println("not keith number"+n);
}
}
}