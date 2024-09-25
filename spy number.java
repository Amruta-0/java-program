class spy number
{
public static void main(String args[])
 {
int num,sum=0,pro=1;rem;
System.out.println("Enter the number");
while(num>0)
   {
    rem=a%10;
    sum=sum+rem;
    pro=pro*rem;
    num=num/10;
   }
if(sum==pro)
    {
System.out.println("spy number");
    }
else
     {
System.out.println("not spy number");
     }
 }
}