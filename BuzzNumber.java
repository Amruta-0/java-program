class BuzzNumber
{
public static void main(String args[])
{
int num=63;
int sum=0;
int n;
while(num>0)
{
num%10==7;
sum=sum*num;
num=num/10;
}
if(num==0)
{
System.out.println(num+ "buzz number");
}
else
{
System.out.println(num+ "not buzz number");
}
}
}
}
